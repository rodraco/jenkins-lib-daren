def call(){ 
    sh "echo Hello World"
}

def add(int n1, int n2){
    sh "echo sum of ${n1} and ${n2} is ${n1 + n2}"
}