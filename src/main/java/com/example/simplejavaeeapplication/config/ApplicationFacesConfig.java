package com.example.simplejavaeeapplication.config;

import javax.faces.annotation.FacesConfig;

/**
 * 对于JSF 2.3和CDI结合使用时，需要加这个注解.
 * 否则会报 Target Unreachable, identifier null 错误
 * https://stackoverflow.com/questions/45682309/changing-faces-config-xml-from-2-2-to-2-3-causes-javax-el-propertynotfoundexcept
 */
@FacesConfig(version = FacesConfig.Version.JSF_2_3)
public class ApplicationFacesConfig {
}
