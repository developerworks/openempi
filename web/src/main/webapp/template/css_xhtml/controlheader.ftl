<#--


     Copyright (C) 2009 SYSNET International, Inc. <support@sysnetint.com>

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
     implied. See the License for the specific language governing
     permissions and limitations under the License.


-->
<#--
	Only show message if errors are available.
	This will be done if ActionSupport is used.
-->
<#assign hasFieldErrors = parameters.name?exists && fieldErrors?exists && fieldErrors[parameters.name]?exists/>
<li <#rt/><#if parameters.id?exists>id="wwgrp_${parameters.id}"<#rt/></#if> class="wwgrp">

<#if parameters.label?exists>
    <#if parameters.labelposition?default("top") == 'top'>
    <div <#rt/>
	<#else>
	<span <#rt/>
    </#if>
    <#if parameters.labelposition?default("top") != 'bottom'>
        <#if parameters.id?exists>id="wwlbl_${parameters.id}"<#rt/></#if> class="wwlbl">
            <label <#t/>
        <#if parameters.id?exists>
                for="${parameters.id?html}" <#t/>
        </#if>
        <#if hasFieldErrors>
                class="desc error"<#t/>
        <#else>
                class="desc"<#t/>
        </#if>
        ><#t/>
            ${parameters.label?html}
        <#if parameters.required?default(false)>
                <span class="req">*</span><#t/>
        </#if>
        <#include "/${parameters.templateDir}/xhtml/tooltip.ftl" />
        </label><#t/>
        <#if parameters.labelposition?default("top") == 'top'>
        </div> <#rt/>
        <#else>
        </span> <#rt/>
        </#if>
        <#if hasFieldErrors>
        <#list fieldErrors[parameters.name] as error>
            <span class="fieldError"><img src="${base}/images/iconWarning.gif" alt="Validation Error" class="icon" /> ${error?html}</span><#lt/>
        </#list>
        </#if>
    </#if>
</#if>

<#if parameters.labelposition?default("top") == 'top'>
<div <#rt/>
<#else>
<span <#rt/>
</#if>
<#if parameters.id?exists>id="wwctrl_${parameters.id}"<#rt/></#if> class="wwctrl">
