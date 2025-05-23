/*    */ package ai.grazie.model.llm;
/*    */ import java.util.Map;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.ranges.RangesKt;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\r\b\001\030\000 \r2\b\022\004\022\0020\0000\001:\001\rB\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005j\002\b\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\f¨\006\016"}, d2 = {"Lai/grazie/model/llm/LLMType;", "", "(Ljava/lang/String;I)V", "OpenAI", "Anthropic", "Google", "Grazie", "Alibaba", "Mistral", "HuggingFace", "DeepSeek", "Local", "Unknown", "Companion", "model-llm"})
/*    */ public enum LLMType {
/* 17 */   OpenAI,
/* 18 */   Anthropic,
/* 19 */   Google,
/* 20 */   Grazie,
/* 21 */   Alibaba,
/* 22 */   Mistral,
/* 23 */   HuggingFace,
/* 24 */   DeepSeek,
/* 25 */   Local,
/* 26 */   Unknown; @NotNull public static final Companion Companion; @NotNull private static final Lazy<Map<String, LLMType>> values$delegate; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; static { Companion = new Companion(null);
/*    */ 
/*    */     
/* 29 */     values$delegate = LazyKt.lazy(LLMType$Companion$values$2.INSTANCE); $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020$\n\002\020\016\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\013\032\b\022\004\022\0020\0060\fHÆ\001J\020\020\r\032\004\030\0010\0062\006\020\016\032\0020\005R'\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\0048BX\002¢\006\f\n\004\b\t\020\n\032\004\b\007\020\b¨\006\017"}, d2 = {"Lai/grazie/model/llm/LLMType$Companion;", "", "()V", "values", "", "", "Lai/grazie/model/llm/LLMType;", "getValues", "()Ljava/util/Map;", "values$delegate", "Lkotlin/Lazy;", "serializer", "Lkotlinx/serialization/KSerializer;", "tryParse", "value", "model-llm"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LLMType> serializer() { return get$cachedSerializer(); } private final Map<String, LLMType> getValues() { Lazy lazy = LLMType.values$delegate; return (Map<String, LLMType>)lazy.getValue(); }
/*    */ 
/*    */     
/*    */     @Nullable
/* 33 */     public final LLMType tryParse(@NotNull String value) { Intrinsics.checkNotNullParameter(value, "value"); return getValues().get(value); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { return EnumsKt.createSimpleEnumSerializer("ai.grazie.model.llm.LLMType", (Enum[])LLMType.values()); }
/*    */   } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\000\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "Lai/grazie/model/llm/LLMType;", "invoke"}) @SourceDebugExtension({"SMAP\nLLMType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMType.kt\nai/grazie/model/llm/LLMType$Companion$values$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,36:1\n8634#2,2:37\n8894#2,4:39\n*S KotlinDebug\n*F\n+ 1 LLMType.kt\nai/grazie/model/llm/LLMType$Companion$values$2\n*L\n30#1:37,2\n30#1:39,4\n*E\n"}) static final class LLMType$Companion$values$2 extends Lambda implements Function0<Map<String, ? extends LLMType>> {
/*    */     public final Map<String, LLMType> invoke() { LLMType[] arrayOfLLMType1 = LLMType.values(); int $i$f$associateBy = 0;
/* 37 */       int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(arrayOfLLMType1.length), 16);
/* 38 */       LLMType[] arrayOfLLMType2 = arrayOfLLMType1; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateByTo = 0; byte b; int i;
/* 39 */       for (b = 0, i = arrayOfLLMType2.length; b < i; ) { Object element$iv$iv = arrayOfLLMType2[b];
/* 40 */         Object object1 = element$iv$iv; Map<Object, Object> map = destination$iv$iv; int $i$a$-associateBy-LLMType$Companion$values$2$1 = 0; map.put(object1.name(), element$iv$iv); }
/*    */       
/* 42 */       return (Map)destination$iv$iv; }
/*    */ 
/*    */     
/*    */     public static final LLMType$Companion$values$2 INSTANCE = new LLMType$Companion$values$2();
/*    */     
/*    */     LLMType$Companion$values$2() {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\LLMType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */