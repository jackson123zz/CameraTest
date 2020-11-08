#include <iostream>
#include <gtest/gtest.h>
extern "C" int Add(int a, int b);

TEST(test_my_class, get_age)
{
    ASSERT_TRUE(Add(2, 3) == 5);
}

int main(int argc, char* argv[])
{
    for (int i = 0; i < argc; i++) {
        std::cout << argv[i] << std::endl;
    }
    std::cout << "Add result is " << Add(2, 3) << std::endl;
    return 0;
}