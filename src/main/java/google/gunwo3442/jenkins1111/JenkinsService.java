package google.gunwo3442.jenkins1111;

import org.springframework.stereotype.Service;

@Service
public class JenkinsService {
    public int  hap(int n){
        int result = 0;
        for(int i=1; i<=n; i++){
            result += i;
        }
        return result;
    }

    public int factorial(int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }
}
