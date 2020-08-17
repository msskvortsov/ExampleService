#include <QCoreApplication>

#include <android/log.h>

int main(int argc, char *argv[])
{
    QCoreApplication a(argc, argv);

    __android_log_print(ANDROID_LOG_INFO, "Example", "Hello from main");

    return a.exec();
}
