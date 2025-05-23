/*    */ package ai.grazie.model.llm.data.stream;
/*    */ 
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.MapsKt;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.ranges.RangesKt;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\000\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nLLMStreamFinishMetaData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMStreamFinishMetaData.kt\nai/grazie/model/llm/data/stream/LLMStreamFinishReason$Companion$values$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,37:1\n8634#2,2:38\n8894#2,4:40\n*S KotlinDebug\n*F\n+ 1 LLMStreamFinishMetaData.kt\nai/grazie/model/llm/data/stream/LLMStreamFinishReason$Companion$values$2\n*L\n31#1:38,2\n31#1:40,4\n*E\n"})
/*    */ final class LLMStreamFinishReason$Companion$values$2
/*    */   extends Lambda
/*    */   implements Function0<Map<String, ? extends LLMStreamFinishReason>>
/*    */ {
/*    */   public static final LLMStreamFinishReason$Companion$values$2 INSTANCE = new LLMStreamFinishReason$Companion$values$2();
/*    */   
/*    */   public final Map<String, LLMStreamFinishReason> invoke() {
/* 31 */     LLMStreamFinishReason[] arrayOfLLMStreamFinishReason1 = LLMStreamFinishReason.values(); int $i$f$associateBy = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(arrayOfLLMStreamFinishReason1.length), 16);
/* 39 */     LLMStreamFinishReason[] arrayOfLLMStreamFinishReason2 = arrayOfLLMStreamFinishReason1; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateByTo = 0; byte b; int i;
/* 40 */     for (b = 0, i = arrayOfLLMStreamFinishReason2.length; b < i; ) { Object element$iv$iv = arrayOfLLMStreamFinishReason2[b];
/* 41 */       Object object1 = element$iv$iv; Map<Object, Object> map = destination$iv$iv; int $i$a$-associateBy-LLMStreamFinishReason$Companion$values$2$1 = 0; map.put(object1.getValue(), element$iv$iv); }
/*    */     
/* 43 */     return (Map)destination$iv$iv;
/*    */   }
/*    */   
/*    */   LLMStreamFinishReason$Companion$values$2() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\data\stream\LLMStreamFinishReason$Companion$values$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */