/*    */ package ai.grazie.quota.spend;
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\006\b\001\030\000 \0062\b\022\004\022\0020\0000\001:\001\006B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\007"}, d2 = {"Lai/grazie/quota/spend/SpendType;", "", "(Ljava/lang/String;I)V", "CONTEXT", "GENERATION", "SINGLE_PAYMENT", "Companion", "model-quota"})
/*    */ public enum SpendType {
/*  8 */   CONTEXT,
/*    */ 
/*    */   
/* 11 */   GENERATION,
/*    */ 
/*    */   
/* 14 */   SINGLE_PAYMENT; @NotNull public static final Companion Companion; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); }
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
/*    */       String[] arrayOfString = new String[3];
/*    */       arrayOfString[0] = "context";
/*    */       arrayOfString[1] = "generation";
/*    */       arrayOfString[2] = "single";
/*    */       Annotation[][] arrayOfAnnotation = new Annotation[3][];
/*    */       arrayOfAnnotation[0] = null;
/*    */       arrayOfAnnotation[1] = null;
/*    */       arrayOfAnnotation[2] = null;
/*    */       return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.quota.spend.SpendType", (Enum[])SpendType.values(), arrayOfString, arrayOfAnnotation, null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/quota/spend/SpendType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/quota/spend/SpendType;", "model-quota"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<SpendType> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-quota-jvm-0.4.32.jar!\ai\grazie\quota\spend\SpendType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */