/*    */ package ai.grazie.tone;
/*    */ 
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\016\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/tone/DocFormalityTone;", "invoke"})
/*    */ final class null
/*    */   extends Lambda
/*    */   implements Function1<DocFormalityTone, String>
/*    */ {
/*    */   public static final null INSTANCE = (null)new Object();
/*    */   
/*    */   null() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   public final String invoke(DocFormalityTone it) {
/* 22 */     Intrinsics.checkNotNullParameter(it, "it"); Intrinsics.checkNotNullExpressionValue(it.name().toLowerCase(Locale.ROOT), "toLowerCase(...)"); return it.name().toLowerCase(Locale.ROOT);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-tone-formality-jvm-0.4.32.jar!\ai\grazie\tone\DocFormalityToneSerializer$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */