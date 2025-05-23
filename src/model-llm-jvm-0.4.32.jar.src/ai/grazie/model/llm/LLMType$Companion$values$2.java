/*    */ package ai.grazie.model.llm;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\000\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "Lai/grazie/model/llm/LLMType;", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nLLMType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMType.kt\nai/grazie/model/llm/LLMType$Companion$values$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,36:1\n8634#2,2:37\n8894#2,4:39\n*S KotlinDebug\n*F\n+ 1 LLMType.kt\nai/grazie/model/llm/LLMType$Companion$values$2\n*L\n30#1:37,2\n30#1:39,4\n*E\n"})
/*    */ final class LLMType$Companion$values$2
/*    */   extends Lambda
/*    */   implements Function0<Map<String, ? extends LLMType>>
/*    */ {
/*    */   public static final LLMType$Companion$values$2 INSTANCE = new LLMType$Companion$values$2();
/*    */   
/*    */   public final Map<String, LLMType> invoke() {
/* 30 */     LLMType[] arrayOfLLMType1 = LLMType.values(); int $i$f$associateBy = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 37 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(arrayOfLLMType1.length), 16);
/* 38 */     LLMType[] arrayOfLLMType2 = arrayOfLLMType1; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateByTo = 0; byte b; int i;
/* 39 */     for (b = 0, i = arrayOfLLMType2.length; b < i; ) { Object element$iv$iv = arrayOfLLMType2[b];
/* 40 */       Object object1 = element$iv$iv; Map<Object, Object> map = destination$iv$iv; int $i$a$-associateBy-LLMType$Companion$values$2$1 = 0; map.put(object1.name(), element$iv$iv); }
/*    */     
/* 42 */     return (Map)destination$iv$iv;
/*    */   }
/*    */   
/*    */   LLMType$Companion$values$2() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\LLMType$Companion$values$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */