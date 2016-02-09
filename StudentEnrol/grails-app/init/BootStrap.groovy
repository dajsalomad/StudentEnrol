import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->

def course1= new Course(title: 'Interactive Media with Animation',

department: 'Computing',

description: ''' Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei.''',

leader: 'Joe Jojo',

code: 'Ima101',

startDate: new Date('19/01/2015'),
endDate: new Date('19/01/2020')).save()

def course2= new Course(title: 'IT Service Management',

department: 'Computing',

description: ''' Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei.''',

leader: 'Niall Frain',

code: 'Ima101',

startDate: new Date('19/01/2017'),
endDate: new Date('19/01/2022')).save()

def course3= new Course(title: 'Network Management',

department: 'Computing',

description: ''' Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei.''',

leader: 'Salomey Addae',

code: 'Ima101',

startDate: new Date('19/01/2018'),
endDate: new Date('19/01/2023')).save()
 
    }
    def destroy = {
    }
}


