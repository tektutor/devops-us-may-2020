#!/usr/bin/python

from flask import Flask
app = Flask( __name__ )

@app.route("/")

def sayHello():
    return "Hello Python - Container 3"

if __name__ == "__main__":
    app.run(host='0.0.0.0')
