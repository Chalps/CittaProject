import 'dart:async';
import 'dart:convert';
import 'dart:ui';

import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:http/http.dart' as http;

void main() => runApp(MyApp());

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.purple,
      ),
      home: Home(),
    );
  }
}

class Home extends StatefulWidget {
  @override
  _HomeState createState() => _HomeState();
}

class _HomeState extends State<Home> {
  late List data;
  Timer? timer;
  Future<String> getJSONData() async {
    var url = Uri.parse('http://192.168.0.102:8080/services');
    var response = await http.get(url);

    setState(() {
      data = json.decode(response.body);
      print(response.statusCode);
    });

    return "Dados obtidos com sucesso";
  }

  @override
  void initState() {
    super.initState();
    this.getJSONData();
    timer = Timer.periodic(Duration(seconds: 5), (Timer t) => getJSONData());
  }

  @override
  void dispose() {
    timer?.cancel();
    super.dispose();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text("CittaMobi"),
          centerTitle: true,
          // bottom: LinearProgressIndicator(backgroundColor:Colors.orange);
        ),
        body: receiveData());
  }

  receiveData() {
    if (data.isEmpty) {
      return Center(child: CircularProgressIndicator());
    } else {
      return _listView();
    }
  }

  _listView() {
    return ListView.builder(
      itemCount: data == null ? 0 : data.length,
      itemBuilder: (context, index) {
        return cardService(data[index]);
      },
    );
  }

  Card cardService(dynamic item) {
    return Card(
      elevation: 3,
      shadowColor: Colors.deepPurple,
      margin: new EdgeInsets.symmetric(
        horizontal: 15.0,
        vertical: 10.0,
      ),
      child: Container(
        decoration: BoxDecoration(
          color: Colors.white,
          borderRadius: BorderRadius.circular(12),
        ),
        child: ListTile(
          contentPadding:
              EdgeInsets.symmetric(horizontal: 25.0, vertical: 10.0),
          title: Text(item["routeCode"] + " - " + item['routeMnemonic'] + ":\n",
              style: GoogleFonts.roboto(
                  color: Colors.black, fontWeight: FontWeight.w500)),
          subtitle: Text(item['predictionType'],
              style: TextStyle(
                  color: Colors.orange,
                  fontWeight: FontWeight.bold,
                  fontSize: 16)),
          onTap: () {},
        ),
      ),
    );
  }
}
