/*    */ package ai.grazie.auth.model.cfg;
/*    */ import ai.grazie.auth.model.GrazieUserAttributes;
/*    */ import ai.grazie.user.cfg.model.Configuration;
/*    */ import ai.grazie.user.cfg.model.proxy.AttributeCustomProxy;
/*    */ import ai.grazie.user.cfg.model.proxy.AttributeProxy;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\020\016\n\002\b\007\n\002\030\002\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\013\020\fR\027\020\r\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\016\020\fR\027\020\017\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\020\020\fR\027\020\021\032\b\022\004\022\0020\0230\022¢\006\b\n\000\032\004\b\024\020\025¨\006\026"}, d2 = {"Lai/grazie/auth/model/cfg/UserConfigurationDefinition;", "Lai/grazie/user/cfg/model/Configuration;", "()V", "Survey", "", "getSurvey$annotations", "getSurvey", "()Ljava/lang/Object;", "color", "Lai/grazie/user/cfg/model/proxy/AttributeProxy;", "", "getColor", "()Lai/grazie/user/cfg/model/proxy/AttributeProxy;", "email", "getEmail", "fullName", "getFullName", "onboardingSurvey", "Lai/grazie/user/cfg/model/proxy/AttributeCustomProxy;", "Lai/grazie/auth/model/survey/OnboardingSurveyDTO;", "getOnboardingSurvey", "()Lai/grazie/user/cfg/model/proxy/AttributeCustomProxy;", "auth-model"})
/*    */ public final class UserConfigurationDefinition extends Configuration {
/*    */   @NotNull
/* 11 */   public static final UserConfigurationDefinition INSTANCE = new UserConfigurationDefinition(); @NotNull private static final AttributeProxy<String> fullName = Configuration.text$default(INSTANCE, GrazieUserAttributes.Meta.INSTANCE.getFullName().getFqdn(), null, 2, null); @NotNull public final AttributeProxy<String> getFullName() { return fullName; } @NotNull
/* 12 */   private static final AttributeProxy<String> email = Configuration.text$default(INSTANCE, GrazieUserAttributes.Meta.INSTANCE.getEmail().getFqdn(), null, 2, null); @NotNull public final AttributeProxy<String> getEmail() { return email; } @NotNull
/* 13 */   private static final AttributeProxy<String> color = Configuration.text$default(INSTANCE, GrazieUserAttributes.Avatar.INSTANCE.getColor().getFqdn(), null, 2, null); @NotNull public final AttributeProxy<String> getColor() { return color; } @NotNull
/* 14 */   private static final AttributeCustomProxy<OnboardingSurveyDTO> onboardingSurvey = ConfigurationKt.customProxy(GrazieUserAttributes.Survey.INSTANCE.getDTO(), OnboardingSurveyDTO.Companion.serializer()); @NotNull public final AttributeCustomProxy<OnboardingSurveyDTO> getOnboardingSurvey() { return onboardingSurvey; }
/*    */   
/*    */   @NotNull
/* 17 */   private static final Object Survey = new UserConfigurationDefinition$Survey$1(); @NotNull public final Object getSurvey() { return Survey; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\020\000\n\000\n\002\030\002\n\002\020\021\n\002\020\016\n\002\b\005*\001\000\b\n\030\0002\0020\001R\035\020\002\032\016\022\n\022\b\022\004\022\0020\0050\0040\003¢\006\b\n\000\032\004\b\006\020\007R\035\020\b\032\016\022\n\022\b\022\004\022\0020\0050\0040\003¢\006\b\n\000\032\004\b\t\020\007¨\006\n"}, d2 = {"ai/grazie/auth/model/cfg/UserConfigurationDefinition$Survey$1", "", "goals", "Lai/grazie/user/cfg/model/proxy/AttributeCustomProxy;", "", "", "getGoals", "()Lai/grazie/user/cfg/model/proxy/AttributeCustomProxy;", "tools", "getTools", "auth-model"})
/* 18 */   public static final class UserConfigurationDefinition$Survey$1 { private final AttributeCustomProxy<String[]> goals = UserConfigurationDefinition.INSTANCE.texts(GrazieUserAttributes.Survey.INSTANCE.getGoals()); public final AttributeCustomProxy<String[]> getGoals() { return this.goals; }
/* 19 */      private final AttributeCustomProxy<String[]> tools = UserConfigurationDefinition.INSTANCE.texts(GrazieUserAttributes.Survey.INSTANCE.getTools()); public final AttributeCustomProxy<String[]> getTools() { return this.tools; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\cfg\UserConfigurationDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */