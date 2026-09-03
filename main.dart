import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'second app',
      home: Scaffold(
        appBar: AppBar(title: Text('first app')),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Text('welcome to mca', style: TextStyle(fontSize: 30)),
              SizedBox(height: 20),
              Text('mepco engineering college', style: TextStyle(fontSize: 50)),
              Text('M.Rahul', style: TextStyle(fontSize: 50)),
              Text('mca1457', style: TextStyle(fontSize: 50)),
              Text('Course:MCA', style: TextStyle(fontSize: 50)),
            ],
          ),
        ),
      ),
    );
  }
}
