/*    */ package ai.grazie.auth.model.cfg;
/*    */ 
/*    */ import ai.grazie.auth.model.GrazieUserAttributes;
/*    */ import ai.grazie.user.cfg.model.proxy.AttributeCustomProxy;
/*    */ import kotlin.Metadata;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\020\000\n\000\n\002\030\002\n\002\020\021\n\002\020\016\n\002\b\005*\001\000\b\n\030\0002\0020\001R\035\020\002\032\016\022\n\022\b\022\004\022\0020\0050\0040\003¢\006\b\n\000\032\004\b\006\020\007R\035\020\b\032\016\022\n\022\b\022\004\022\0020\0050\0040\003¢\006\b\n\000\032\004\b\t\020\007¨\006\n"}, d2 = {"ai/grazie/auth/model/cfg/UserConfigurationDefinition$Survey$1", "", "goals", "Lai/grazie/user/cfg/model/proxy/AttributeCustomProxy;", "", "", "getGoals", "()Lai/grazie/user/cfg/model/proxy/AttributeCustomProxy;", "tools", "getTools", "auth-model"})
/*    */ public final class UserConfigurationDefinition$Survey$1
/*    */ {
/* 18 */   private final AttributeCustomProxy<String[]> goals = UserConfigurationDefinition.INSTANCE.texts(GrazieUserAttributes.Survey.INSTANCE.getGoals()); public final AttributeCustomProxy<String[]> getGoals() { return this.goals; }
/* 19 */    private final AttributeCustomProxy<String[]> tools = UserConfigurationDefinition.INSTANCE.texts(GrazieUserAttributes.Survey.INSTANCE.getTools()); public final AttributeCustomProxy<String[]> getTools() { return this.tools; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\cfg\UserConfigurationDefinition$Survey$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */