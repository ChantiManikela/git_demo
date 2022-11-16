#include <jni.h>
#include <string>
#include <iostream>

/*extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_hello_1cmake_MainActivity_stringFromJNI(JNIEnv *env, jobject thiz) {
    // TODO: implement stringFromJNI()
    std::string hello = "Hello from C++";

    int* p = (int*) malloc(8*sizeof(int));

    *p = 100;

    // deallocated the space allocated to p
    free(p);

    // core dump/segmentation fault
    //  as now this statement is illegal
    *p = 110;

    std::cout<<p;

    //return 0;

    return env->NewStringUTF(hello.c_str());

    } */

// SIGFPE Code
/*extern "C"
JNIEXPORT jobject JNICALL
Java_com_example_hello_1cmake_MainActivity_integerFromJNI(JNIEnv *env, jobject) {
    // TODO: implement integerFromJNI()
    int x,y=10;

     x=y/2;  // Accessing out of bound

    //return 0;
    return x;
    //return env->NewStringUTF(hello.c_str());

}*/

/*extern "C"
JNIEXPORT jint JNICALL
Java_com_example_hello_1cmake_MainActivity_sigfpeErrorJNI(JNIEnv *env, jobject thiz) {
    // TODO: implement sigfpeErrorJNI()
    int x,y=10;

    x=y/0;  // Accessing out of bound

    //return 0;
    return x;

}*/
extern "C"
JNIEXPORT jint JNICALL
Java_com_example_hello_1cmake_MainActivity_sigbusErrorJNI(JNIEnv *env, jobject thiz) {
    // TODO: implement sigbusErrorJNI()
    int i = 3;
    int *k;
    k = &i;
    k++;
    printf("%d ",*k);
    return *k;

    /*int argc; char **argv;

    __asm__("pushf\norl $0x40000,(%esp)\npopf");
    __asm__("pushf\norl $0x40000,(%rsp)\npopf");
    char *cptr = static_cast<char *>(malloc(sizeof(int) + 1));
    int *iptr = (int *) ++cptr;
    *iptr = 42;
    return *cptr;*/


}