/*    */ package ai.grazie.model.cloud.sse.continuous.events.type;
/*    */ import java.util.Map;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = ContinuousSSEPrematureEnd.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\b\b\001\030\000 \t2\b\022\004\022\0020\0000\001:\002\t\nB\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\b¨\006\013"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ContentFilter", "Unknown", "Companion", "Serializer", "model-cloud"})
/*    */ public enum ContinuousSSEPrematureEnd {
/* 13 */   ContentFilter("content_filter"),
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 18 */   Unknown("unknown"); @NotNull public static final Companion Companion; @NotNull private final String value; @NotNull private static final Lazy<Map<String, ContinuousSSEPrematureEnd>> values$delegate; ContinuousSSEPrematureEnd(String value) { this.value = value; } @NotNull public final String getValue() { return this.value; } static { Companion = new Companion(null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 27 */     values$delegate = LazyKt.lazy(ContinuousSSEPrematureEnd$Companion$values$2.INSTANCE); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;", "()V", "model-cloud"}) public static final class Serializer extends StringValueClassSerializer<ContinuousSSEPrematureEnd> { @NotNull public static final Serializer INSTANCE = new Serializer(); private Serializer() { super("ContinuousSSEPrematureEnd", null.INSTANCE, null.INSTANCE); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020$\n\002\020\016\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\013\032\b\022\004\022\0020\0060\fHÆ\001J\020\020\r\032\004\030\0010\0062\006\020\016\032\0020\005R'\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\0048BX\002¢\006\f\n\004\b\t\020\n\032\004\b\007\020\b¨\006\017"}, d2 = {"Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd$Companion;", "", "()V", "values", "", "", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;", "getValues", "()Ljava/util/Map;", "values$delegate", "Lkotlin/Lazy;", "serializer", "Lkotlinx/serialization/KSerializer;", "tryParse", "value", "model-cloud"}) public static final class Companion { private Companion() {} private final Map<String, ContinuousSSEPrematureEnd> getValues() { Lazy lazy = ContinuousSSEPrematureEnd.values$delegate; return (Map<String, ContinuousSSEPrematureEnd>)lazy.getValue(); }
/*    */     @NotNull
/*    */     public final KSerializer<ContinuousSSEPrematureEnd> serializer() { return (KSerializer<ContinuousSSEPrematureEnd>)ContinuousSSEPrematureEnd.Serializer.INSTANCE; } @Nullable
/*    */     public final ContinuousSSEPrematureEnd tryParse(@NotNull String value) {
/* 31 */       Intrinsics.checkNotNullParameter(value, "value"); return getValues().get(value); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\000\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "Lai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd;", "invoke"})
/*    */   @SourceDebugExtension({"SMAP\nContinuousSSEPrematureEnd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuousSSEPrematureEnd.kt\nai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd$Companion$values$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,34:1\n8634#2,2:35\n8894#2,4:37\n*S KotlinDebug\n*F\n+ 1 ContinuousSSEPrematureEnd.kt\nai/grazie/model/cloud/sse/continuous/events/type/ContinuousSSEPrematureEnd$Companion$values$2\n*L\n28#1:35,2\n28#1:37,4\n*E\n"})
/*    */   static final class ContinuousSSEPrematureEnd$Companion$values$2 extends Lambda implements Function0<Map<String, ? extends ContinuousSSEPrematureEnd>> { public static final ContinuousSSEPrematureEnd$Companion$values$2 INSTANCE = new ContinuousSSEPrematureEnd$Companion$values$2(); public final Map<String, ContinuousSSEPrematureEnd> invoke() { ContinuousSSEPrematureEnd[] arrayOfContinuousSSEPrematureEnd1 = ContinuousSSEPrematureEnd.values();
/*    */       int $i$f$associateBy = 0;
/* 35 */       int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(arrayOfContinuousSSEPrematureEnd1.length), 16);
/* 36 */       ContinuousSSEPrematureEnd[] arrayOfContinuousSSEPrematureEnd2 = arrayOfContinuousSSEPrematureEnd1; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateByTo = 0; byte b; int i;
/* 37 */       for (b = 0, i = arrayOfContinuousSSEPrematureEnd2.length; b < i; ) { Object element$iv$iv = arrayOfContinuousSSEPrematureEnd2[b];
/* 38 */         Object object1 = element$iv$iv; Map<Object, Object> map = destination$iv$iv; int $i$a$-associateBy-ContinuousSSEPrematureEnd$Companion$values$2$1 = 0; map.put(object1.getValue(), element$iv$iv); }
/*    */       
/* 40 */       return (Map)destination$iv$iv; }
/*    */ 
/*    */     
/*    */     ContinuousSSEPrematureEnd$Companion$values$2() {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\sse\continuous\events\type\ContinuousSSEPrematureEnd.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */