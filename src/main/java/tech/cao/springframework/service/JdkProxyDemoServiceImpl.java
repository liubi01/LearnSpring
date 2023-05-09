package tech.cao.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class JdkProxyDemoServiceImpl implements IJdkProxyService{
    @Override
    public void doMethod1() {

    }

    @Override
    public String doMethod2() {
        return null;
    }

    @Override
    public String doMethod3() throws Exception {
        return null;
    }
}
