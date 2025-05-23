/*    */ package ai.grazie.model.cloud.sse.continuous.events.type;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\000\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;", "invoke"})
/*    */ @SourceDebugExtension({"SMAP\nContinuousSSEPrematureEnd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuousSSEPrematureEnd.kt\nai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd$Companion$values$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,34:1\n8634#2,2:35\n8894#2,4:37\n*S KotlinDebug\n*F\n+ 1 ContinuousSSEPrematureEnd.kt\nai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd$Companion$values$2\n*L\n28#1:35,2\n28#1:37,4\n*E\n"})
/*    */ final class ContinuousSSEPrematureEnd$Companion$values$2
/*    */   extends Lambda
/*    */   implements Function0<Map<String, ? extends ContinuousSSEPrematureEnd>>
/*    */ {
/*    */   public static final ContinuousSSEPrematureEnd$Companion$values$2 INSTANCE = new ContinuousSSEPrematureEnd$Companion$values$2();
/*    */   
/*    */   public final Map<String, ContinuousSSEPrematureEnd> invoke() {
/* 28 */     ContinuousSSEPrematureEnd[] arrayOfContinuousSSEPrematureEnd1 = ContinuousSSEPrematureEnd.values(); int $i$f$associateBy = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 35 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(arrayOfContinuousSSEPrematureEnd1.length), 16);
/* 36 */     ContinuousSSEPrematureEnd[] arrayOfContinuousSSEPrematureEnd2 = arrayOfContinuousSSEPrematureEnd1; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateByTo = 0; byte b; int i;
/* 37 */     for (b = 0, i = arrayOfContinuousSSEPrematureEnd2.length; b < i; ) { Object element$iv$iv = arrayOfContinuousSSEPrematureEnd2[b];
/* 38 */       Object object1 = element$iv$iv; Map<Object, Object> map = destination$iv$iv; int $i$a$-associateBy-ContinuousSSEPrematureEnd$Companion$values$2$1 = 0; map.put(object1.getValue(), element$iv$iv); }
/*    */     
/* 40 */     return (Map)destination$iv$iv;
/*    */   }
/*    */   
/*    */   ContinuousSSEPrematureEnd$Companion$values$2() {
/*    */     super(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\events\type\ContinuousSSEPrematureEnd$Companion$values$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */