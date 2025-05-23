/*    */ package ai.grazie.auth.model;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\b\b\007\030\000 \0042\0020\001:\006\003\004\005\006\007\bB\005¢\006\002\020\002¨\006\t"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes;", "", "()V", "Avatar", "Companion", "Consent", "Meta", "Statistic", "Survey", "auth-model"})
/*    */ public final class GrazieUserAttributes {
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\031\020\003\032\b\022\004\022\0020\0050\004¢\006\n\n\002\020\b\032\004\b\006\020\007¨\006\t"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Companion;", "", "()V", "all", "", "Lai/grazie/utils/attributes/Attributes$Key;", "getAll", "()[Lai/grazie/utils/attributes/Attributes$Key;", "[Lai/grazie/utils/attributes/Attributes$Key;", "auth-model"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     @NotNull
/*  9 */     public final Attributes.Key[] getAll() { return GrazieUserAttributes.all; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull
/* 10 */   private static final Attributes.Key[] all; static { Attributes.Key[] arrayOfKey = new Attributes.Key[13]; arrayOfKey[0] = (Attributes.Key)Meta.INSTANCE.getEmail(); arrayOfKey[1] = 
/* 11 */       (Attributes.Key)Meta.INSTANCE.getFullName();
/* 12 */     arrayOfKey[2] = (Attributes.Key)Statistic.INSTANCE.getLastSeen();
/* 13 */     arrayOfKey[3] = (Attributes.Key)Statistic.INSTANCE.getRegistrationDate();
/* 14 */     arrayOfKey[4] = (Attributes.Key)Avatar.INSTANCE.getColor();
/* 15 */     arrayOfKey[5] = (Attributes.Key)Survey.INSTANCE.getUseCase();
/* 16 */     arrayOfKey[6] = (Attributes.Key)Survey.INSTANCE.getWorkRole();
/* 17 */     arrayOfKey[7] = (Attributes.Key)Survey.INSTANCE.getCompanySize();
/* 18 */     arrayOfKey[8] = (Attributes.Key)Survey.INSTANCE.getGoals();
/* 19 */     arrayOfKey[9] = (Attributes.Key)Survey.INSTANCE.getTools();
/* 20 */     arrayOfKey[10] = (Attributes.Key)Survey.INSTANCE.getDTO();
/* 21 */     arrayOfKey[11] = (Attributes.Key)Consent.Extension.INSTANCE.getStatisticCollection();
/* 22 */     arrayOfKey[12] = (Attributes.Key)Consent.Extension.INSTANCE.getMarketingResearch();
/*    */     all = arrayOfKey; }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Meta;", "", "()V", "Email", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "getEmail", "()Lai/grazie/utils/attributes/Attributes$Key$Text;", "FullName", "getFullName", "auth-model"})
/*    */   public static final class Meta { @NotNull
/* 27 */     public static final Meta INSTANCE = new Meta(); @NotNull private static final Attributes.Key.Text FullName = new Attributes.Key.Text("user.full-name", null, 2, null); @NotNull public final Attributes.Key.Text getFullName() { return FullName; } @NotNull
/* 28 */     private static final Attributes.Key.Text Email = new Attributes.Key.Text("user.email", null, 2, null); @NotNull public final Attributes.Key.Text getEmail() { return Email; }
/*    */      }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Statistic;", "", "()V", "LastSeen", "Lai/grazie/utils/attributes/Attributes$Key$Long;", "getLastSeen", "()Lai/grazie/utils/attributes/Attributes$Key$Long;", "RegistrationDate", "getRegistrationDate", "auth-model"})
/*    */   public static final class Statistic { @NotNull
/* 32 */     public static final Statistic INSTANCE = new Statistic(); @NotNull private static final Attributes.Key.Long LastSeen = new Attributes.Key.Long("user.statistic.last-seen"); @NotNull public final Attributes.Key.Long getLastSeen() { return LastSeen; } @NotNull
/* 33 */     private static final Attributes.Key.Long RegistrationDate = new Attributes.Key.Long("user.statistic.registration-date"); @NotNull public final Attributes.Key.Long getRegistrationDate() { return RegistrationDate; }
/*    */      }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Avatar;", "", "()V", "Color", "Lai/grazie/utils/attributes/Attributes$Key$Text;", "getColor", "()Lai/grazie/utils/attributes/Attributes$Key$Text;", "auth-model"})
/*    */   public static final class Avatar { @NotNull
/* 37 */     public static final Avatar INSTANCE = new Avatar(); @NotNull private static final Attributes.Key.Text Color = new Attributes.Key.Text("user.avatar.color", null, 2, null); @NotNull public final Attributes.Key.Text getColor() { return Color; }
/*    */      }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\022\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007R\021\020\b\032\0020\004¢\006\b\n\000\032\004\b\t\020\007R\034\020\n\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\013\020\002\032\004\b\f\020\007R\034\020\r\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\016\020\002\032\004\b\017\020\007R\034\020\020\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\021\020\002\032\004\b\022\020\007R\034\020\023\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\024\020\002\032\004\b\025\020\007¨\006\026"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Survey;", "", "()V", "CompanySize", "Lai/grazie/utils/attributes/Attributes$Key$Json;", "getCompanySize$annotations", "getCompanySize", "()Lai/grazie/utils/attributes/Attributes$Key$Json;", "DTO", "getDTO", "Goals", "getGoals$annotations", "getGoals", "Tools", "getTools$annotations", "getTools", "UseCase", "getUseCase$annotations", "getUseCase", "WorkRole", "getWorkRole$annotations", "getWorkRole", "auth-model"})
/*    */   public static final class Survey { @NotNull
/* 42 */     public static final Survey INSTANCE = new Survey(); @NotNull private static final Attributes.Key.Json UseCase = new Attributes.Key.Json("user.survey.use-case", null, 2, null); @NotNull public final Attributes.Key.Json getUseCase() { return UseCase; }
/*    */      @NotNull
/* 44 */     private static final Attributes.Key.Json Goals = new Attributes.Key.Json("user.survey.goals", null, 2, null); @NotNull public final Attributes.Key.Json getGoals() { return Goals; }
/*    */      @NotNull
/* 46 */     private static final Attributes.Key.Json WorkRole = new Attributes.Key.Json("user.survey.work-role", null, 2, null); @NotNull public final Attributes.Key.Json getWorkRole() { return WorkRole; }
/*    */      @NotNull
/* 48 */     private static final Attributes.Key.Json Tools = new Attributes.Key.Json("user.survey.tools", null, 2, null); @NotNull public final Attributes.Key.Json getTools() { return Tools; }
/*    */      @NotNull
/* 50 */     private static final Attributes.Key.Json CompanySize = new Attributes.Key.Json("user.survey.company-size", null, 2, null); @NotNull public final Attributes.Key.Json getCompanySize() { return CompanySize; }
/*    */      @NotNull
/* 52 */     private static final Attributes.Key.Json DTO = new Attributes.Key.Json("user.survey.dto", null, 2, null); @NotNull public final Attributes.Key.Json getDTO() { return DTO; }
/*    */      } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\000\n\002\b\003\bÆ\002\030\0002\0020\001:\001\003B\007\b\002¢\006\002\020\002¨\006\004"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Consent;", "", "()V", "Extension", "auth-model"})
/*    */   public static final class Consent { @NotNull
/*    */     public static final Consent INSTANCE = new Consent(); @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Consent$Extension;", "", "()V", "MarketingResearch", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "getMarketingResearch", "()Lai/grazie/utils/attributes/Attributes$Key$Bool;", "StatisticCollection", "getStatisticCollection", "auth-model"})
/*    */     public static final class Extension { @NotNull
/* 57 */       public static final Extension INSTANCE = new Extension(); @NotNull private static final Attributes.Key.Bool StatisticCollection = new Attributes.Key.Bool("user.consent.extension.statistic-collection"); @NotNull public final Attributes.Key.Bool getStatisticCollection() { return StatisticCollection; } @NotNull
/* 58 */       private static final Attributes.Key.Bool MarketingResearch = new Attributes.Key.Bool("user.consent.extension.marketing-research"); @NotNull public final Attributes.Key.Bool getMarketingResearch() { return MarketingResearch; } } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\005\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\004¢\006\b\n\000\032\004\b\b\020\006¨\006\t"}, d2 = {"Lai/grazie/auth/model/GrazieUserAttributes$Consent$Extension;", "", "()V", "MarketingResearch", "Lai/grazie/utils/attributes/Attributes$Key$Bool;", "getMarketingResearch", "()Lai/grazie/utils/attributes/Attributes$Key$Bool;", "StatisticCollection", "getStatisticCollection", "auth-model"}) public static final class Extension { @NotNull private static final Attributes.Key.Bool MarketingResearch = new Attributes.Key.Bool("user.consent.extension.marketing-research"); @NotNull public static final Extension INSTANCE = new Extension(); @NotNull private static final Attributes.Key.Bool StatisticCollection = new Attributes.Key.Bool("user.consent.extension.statistic-collection"); @NotNull public final Attributes.Key.Bool getMarketingResearch() { return MarketingResearch; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final Attributes.Key.Bool getStatisticCollection() {
/*    */       return StatisticCollection;
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\GrazieUserAttributes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */