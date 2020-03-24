package cn.lvhaosir.hello.spring.cloud.alibaba.example.dao;


import cn.lvhaosir.hello.spring.cloud.alibaba.example.entity.About;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutRepository extends JpaRepository<About, Long> {
	
}
