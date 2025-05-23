/*    */ package ai.grazie.auth.model.survey;
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\025\b\001\030\000 \0272\b\022\004\022\0020\0000\001:\001\027B\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\0038F¢\006\006\032\004\b\b\020\006j\002\b\tj\002\b\nj\002\b\013j\002\b\fj\002\b\rj\002\b\016j\002\b\017j\002\b\020j\002\b\021j\002\b\022j\002\b\023j\002\b\024j\002\b\025j\002\b\026¨\006\030"}, d2 = {"Lai/grazie/auth/model/survey/GrazieUserWorkRole;", "", "display", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "id", "getId", "Engineering", "Analytics", "PM", "TechnicalWriting", "CustomerSupport", "Marketing", "HR", "Sales", "Design", "CopyWriting", "Science", "Management", "Student", "None", "Companion", "auth-model"})
/*    */ public enum GrazieUserWorkRole {
/* 12 */   Engineering(
/* 13 */     "Engineering"),
/*    */   
/* 15 */   Analytics(
/* 16 */     "Analytics"),
/*    */   
/* 18 */   PM(
/* 19 */     "PM"),
/*    */   
/* 21 */   TechnicalWriting(
/* 22 */     "Technical Writing"),
/*    */   
/* 24 */   CustomerSupport(
/* 25 */     "Customer Support"),
/*    */   
/* 27 */   Marketing(
/* 28 */     "Marketing"),
/*    */   
/* 30 */   HR(
/* 31 */     "HR"),
/*    */   
/* 33 */   Sales(
/* 34 */     "Sales"),
/*    */   
/* 36 */   Design(
/* 37 */     "Design"),
/*    */   
/* 39 */   CopyWriting(
/* 40 */     "Copywriting"),
/*    */   
/* 42 */   Science(
/* 43 */     "Science"),
/*    */   
/* 45 */   Management(
/* 46 */     "Management"),
/*    */   
/* 48 */   Student(
/* 49 */     "Student"),
/*    */   
/* 51 */   None(
/* 52 */     "None"); @NotNull
/*    */   public static final Companion Companion; @NotNull
/*    */   private final String display; @NotNull
/* 55 */   public final String getId() { switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) { case 1:
/*    */       
/*    */       case 2:
/* 58 */        }  Intrinsics.checkNotNullExpressionValue(name().toLowerCase(Locale.ROOT), "toLowerCase(...)"); return name().toLowerCase(Locale.ROOT); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/*    */   
/*    */   GrazieUserWorkRole(String display) {
/*    */     this.display = display;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final null INSTANCE = (null)new Function0<>();
/*    */     
/*    */     null() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final KSerializer<Object> invoke() {
/*    */       String[] arrayOfString = new String[14];
/*    */       arrayOfString[0] = "engineering";
/*    */       arrayOfString[1] = "analytics";
/*    */       arrayOfString[2] = "pm";
/*    */       arrayOfString[3] = "technical-writing";
/*    */       arrayOfString[4] = "customer-support";
/*    */       arrayOfString[5] = "marketing";
/*    */       arrayOfString[6] = "hr";
/*    */       arrayOfString[7] = "sales";
/*    */       arrayOfString[8] = "design";
/*    */       arrayOfString[9] = "copywriting";
/*    */       arrayOfString[10] = "science";
/*    */       arrayOfString[11] = "management";
/*    */       arrayOfString[12] = "student";
/*    */       arrayOfString[13] = "none";
/*    */       Annotation[][] arrayOfAnnotation = new Annotation[14][];
/*    */       arrayOfAnnotation[0] = null;
/*    */       arrayOfAnnotation[1] = null;
/*    */       arrayOfAnnotation[2] = null;
/*    */       arrayOfAnnotation[3] = null;
/*    */       arrayOfAnnotation[4] = null;
/*    */       arrayOfAnnotation[5] = null;
/*    */       arrayOfAnnotation[6] = null;
/*    */       arrayOfAnnotation[7] = null;
/*    */       arrayOfAnnotation[8] = null;
/*    */       arrayOfAnnotation[9] = null;
/*    */       arrayOfAnnotation[10] = null;
/*    */       arrayOfAnnotation[11] = null;
/*    */       arrayOfAnnotation[12] = null;
/*    */       arrayOfAnnotation[13] = null;
/*    */       return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.auth.model.survey.GrazieUserWorkRole", (Enum[])GrazieUserWorkRole.values(), arrayOfString, arrayOfAnnotation, null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/survey/GrazieUserWorkRole$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/survey/GrazieUserWorkRole;", "auth-model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<GrazieUserWorkRole> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDisplay() {
/*    */     return this.display;
/*    */   }
/*    */   
/*    */   static {
/*    */     Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\survey\GrazieUserWorkRole.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */