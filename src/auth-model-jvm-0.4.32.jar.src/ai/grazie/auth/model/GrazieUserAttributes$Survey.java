/*    */ package ai.grazie.auth.model;
/*    */ 
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\022\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\021\020\b\032\0020\004¢\006\b\n\000\032\004\b\t\020\007R\034\020\n\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\013\020\002\032\004\b\f\020\007R\034\020\r\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\016\020\002\032\004\b\017\020\007R\034\020\020\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\021\020\002\032\004\b\022\020\007R\034\020\023\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\024\020\002\032\004\b\025\020\007¨\006\026"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Survey;", "", "()V", "CompanySize", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "getCompanySize$annotations", "getCompanySize", "()Lai/grazie/utils/attributes/Attributes$Key$Json;", "DTO", "getDTO", "Goals", "getGoals$annotations", "getGoals", "Tools", "getTools$annotations", "getTools", "UseCase", "getUseCase$annotations", "getUseCase", "WorkRole", "getWorkRole$annotations", "getWorkRole", "auth-model"})
/*    */ public final class Survey
/*    */ {
/*    */   @NotNull
/* 42 */   public static final Survey INSTANCE = new Survey(); @NotNull private static final Attributes.Key.Json UseCase = new Attributes.Key.Json("user.survey.use-case", null, 2, null); @NotNull public final Attributes.Key.Json getUseCase() { return UseCase; }
/*    */    @NotNull
/* 44 */   private static final Attributes.Key.Json Goals = new Attributes.Key.Json("user.survey.goals", null, 2, null); @NotNull public final Attributes.Key.Json getGoals() { return Goals; }
/*    */    @NotNull
/* 46 */   private static final Attributes.Key.Json WorkRole = new Attributes.Key.Json("user.survey.work-role", null, 2, null); @NotNull public final Attributes.Key.Json getWorkRole() { return WorkRole; }
/*    */    @NotNull
/* 48 */   private static final Attributes.Key.Json Tools = new Attributes.Key.Json("user.survey.tools", null, 2, null); @NotNull public final Attributes.Key.Json getTools() { return Tools; }
/*    */    @NotNull
/* 50 */   private static final Attributes.Key.Json CompanySize = new Attributes.Key.Json("user.survey.company-size", null, 2, null); @NotNull public final Attributes.Key.Json getCompanySize() { return CompanySize; }
/*    */    @NotNull
/* 52 */   private static final Attributes.Key.Json DTO = new Attributes.Key.Json("user.survey.dto", null, 2, null); @NotNull public final Attributes.Key.Json getDTO() { return DTO; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\GrazieUserAttributes$Survey.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */