package com.studentenrol

class Course {
String department
String title
String leader
String code
Date startDate
Date endDate
String description
String toString(){
"$title, $code, $department"
}

    static constraints = {
title()
department()
description maxSize: 5000
leader()
code()
startDate()
endDate()

    }
}
