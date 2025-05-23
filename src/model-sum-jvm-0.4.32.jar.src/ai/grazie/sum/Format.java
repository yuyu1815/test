/*    */ package ai.grazie.sum;
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\007\b\001\030\000 \0072\b\022\004\022\0020\0000\001:\001\007B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006¨\006\b"}, d2 = {"Lai/grazie/sum/Format;", "", "(Ljava/lang/String;I)V", "Plain", "Markdown", "Youtrack", "YoutrackWithoutTemplates", "Companion", "model-sum"})
/*    */ public enum Format {
/* 10 */   Plain,
/*    */ 
/*    */   
/* 13 */   Markdown,
/*    */ 
/*    */   
/* 16 */   Youtrack,
/*    */ 
/*    */   
/* 19 */   YoutrackWithoutTemplates; @NotNull public static final Companion Companion; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; static { Companion = new Companion(null);
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
/*    */       String[] arrayOfString = new String[4];
/*    */       arrayOfString[0] = "plain";
/*    */       arrayOfString[1] = "markdown";
/*    */       arrayOfString[2] = "youtrack";
/*    */       arrayOfString[3] = "youtrack-no-templates";
/*    */       Annotation[][] arrayOfAnnotation = new Annotation[4][];
/*    */       arrayOfAnnotation[0] = null;
/*    */       arrayOfAnnotation[1] = null;
/*    */       arrayOfAnnotation[2] = null;
/*    */       arrayOfAnnotation[3] = null;
/*    */       return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.sum.Format", (Enum[])Format.values(), arrayOfString, arrayOfAnnotation, null);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/sum/Format$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/sum/Format;", "model-sum"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Format> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-sum-jvm-0.4.32.jar!\ai\grazie\sum\Format.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */