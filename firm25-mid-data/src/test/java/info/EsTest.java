package info;


import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ifohoo.firm25.ifms.middata.corp.domain.CorpBasic;
import com.ifohoo.firm25.ifms.middata.corp.service.CorpBasicService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class EsTest {


    @Autowired
    CorpBasicService corpBasicService;

    @Test
    void name() {
        DynamicDataSourceContextHolder.push("db1");
        QueryWrapper<CorpBasic> wrapper = new QueryWrapper<>();
        wrapper.eq("corp_code","91320602MA1MEPR136");
        Page<CorpBasic> corpBasicPage = corpBasicService.page(new Page<>(1, 10), wrapper);
        System.out.println(corpBasicPage.toString());

    }






}
