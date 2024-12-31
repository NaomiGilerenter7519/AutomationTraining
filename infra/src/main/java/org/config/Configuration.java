

package org.config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.LoadPolicy;
import org.aeonbits.owner.Config.LoadType;

@LoadPolicy(LoadType.MERGE)
@Config.Sources({
    "system:properties",
    "classpath:general.properties"})
public interface Configuration extends Config {


    @Key("browser")
    String browser();

    @Key("url.base")
    String url();

    @Key("user.mail")
    String mailAddress();

    @Key("user.password")
    String userPassword();

}
