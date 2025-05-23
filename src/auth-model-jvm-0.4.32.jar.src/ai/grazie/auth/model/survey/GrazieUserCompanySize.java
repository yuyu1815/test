/*    */ package ai.grazie.auth.model.survey;
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\020\n\002\b\002\n\002\020\016\n\002\b\t\b\001\030\000 \f2\b\022\004\022\0020\0000\001:\001\fB\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013¨\006\r"}, d2 = {"Lai/grazie/auth/model/survey/GrazieUserCompanySize;", "", "(Ljava/lang/String;I)V", "id", "", "getId", "()Ljava/lang/String;", "Solo", "Small", "Medium", "Big", "Large", "Companion", "auth-model"})
/*    */ public enum GrazieUserCompanySize {
/* 11 */   Solo,
/*    */   
/* 13 */   Small,
/*    */   
/* 15 */   Medium,
/*    */   
/* 17 */   Big,
/*    */   
/* 19 */   Large; @NotNull
/*    */   public static final Companion Companion; @NotNull
/*    */   private final String id; @NotNull
/* 22 */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; GrazieUserCompanySize() { Intrinsics.checkNotNullExpressionValue(name().toLowerCase(Locale.ROOT), "toLowerCase(...)"); this.id = name().toLowerCase(Locale.ROOT); } @NotNull public final String getId() { return this.id; }
/*    */ 
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
/*    */       String[] arrayOfString = new String[5];
/*    */       arrayOfString[0] = "solo";
/*    */       arrayOfString[1] = "small";
/*    */       arrayOfString[2] = "medium";
/*    */       arrayOfString[3] = "big";
/*    */       arrayOfString[4] = "large";
/*    */       Annotation[][] arrayOfAnnotation = new Annotation[5][];
/*    */       arrayOfAnnotation[0] = null;
/*    */       arrayOfAnnotation[1] = null;
/*    */       arrayOfAnnotation[2] = null;
/*    */       arrayOfAnnotation[3] = null;
/*    */       arrayOfAnnotation[4] = null;
/*    */       return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.auth.model.survey.GrazieUserCompanySize", (Enum[])GrazieUserCompanySize.values(), arrayOfString, arrayOfAnnotation, null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/auth/model/survey/GrazieUserCompanySize$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/auth/model/survey/GrazieUserCompanySize;", "auth-model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<GrazieUserCompanySize> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */   
/*    */   static {
/*    */     Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\auth-model-jvm-0.4.32.jar!\ai\grazie\auth\model\survey\GrazieUserCompanySize.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */