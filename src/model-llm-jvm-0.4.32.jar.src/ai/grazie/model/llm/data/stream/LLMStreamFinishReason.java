/*    */ package ai.grazie.model.llm.data.stream;
/*    */ import ai.grazie.utils.StringValueClassSerializer;
/*    */ import java.util.Map;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.ranges.RangesKt;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = LLMStreamFinishReason.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\n\b\001\030\000 \0132\b\022\004\022\0020\0000\001:\002\013\fB\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\tj\002\b\n¨\006\r"}, d2 = {"Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Stop", "Length", "FunctionCall", "Unknown", "Companion", "Serializer", "model-llm"})
/*    */ public enum LLMStreamFinishReason {
/* 18 */   Stop("stop"),
/* 19 */   Length("length"),
/* 20 */   FunctionCall("function_call"),
/* 21 */   Unknown("unknown"); @NotNull public static final Companion Companion; @NotNull private final String value; @NotNull private static final Lazy<Map<String, LLMStreamFinishReason>> values$delegate; LLMStreamFinishReason(String value) { this.value = value; } @NotNull public final String getValue() { return this.value; } static { Companion = new Companion(null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 30 */     values$delegate = LazyKt.lazy(LLMStreamFinishReason$Companion$values$2.INSTANCE); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/model/llm/data/stream/LLMStreamFinishReason$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;", "()V", "model-llm"}) public static final class Serializer extends StringValueClassSerializer<LLMStreamFinishReason> { @NotNull public static final Serializer INSTANCE = new Serializer(); private Serializer() { super("LLMStreamFinishReason", null.INSTANCE, null.INSTANCE); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020$\n\002\020\016\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\013\032\b\022\004\022\0020\0060\fHÆ\001J\020\020\r\032\004\030\0010\0062\006\020\016\032\0020\005R'\020\003\032\016\022\004\022\0020\005\022\004\022\0020\0060\0048BX\002¢\006\f\n\004\b\t\020\n\032\004\b\007\020\b¨\006\017"}, d2 = {"Lai/grazie/model/llm/data/stream/LLMStreamFinishReason$Companion;", "", "()V", "values", "", "", "Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;", "getValues", "()Ljava/util/Map;", "values$delegate", "Lkotlin/Lazy;", "serializer", "Lkotlinx/serialization/KSerializer;", "tryParse", "value", "model-llm"}) public static final class Companion { private Companion() {} private final Map<String, LLMStreamFinishReason> getValues() { Lazy lazy = LLMStreamFinishReason.values$delegate; return (Map<String, LLMStreamFinishReason>)lazy.getValue(); }
/*    */     @NotNull
/*    */     public final KSerializer<LLMStreamFinishReason> serializer() { return (KSerializer<LLMStreamFinishReason>)LLMStreamFinishReason.Serializer.INSTANCE; } @Nullable
/*    */     public final LLMStreamFinishReason tryParse(@NotNull String value) {
/* 34 */       Intrinsics.checkNotNullParameter(value, "value"); return getValues().get(value); } } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\020\n\000\n\002\020$\n\002\020\016\n\002\030\002\n\000\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0030\001H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "", "Lai/grazie/model/llm/data/stream/LLMStreamFinishReason;", "invoke"})
/*    */   @SourceDebugExtension({"SMAP\nLLMStreamFinishMetaData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMStreamFinishMetaData.kt\nai/grazie/model/llm/data/stream/LLMStreamFinishReason$Companion$values$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,37:1\n8634#2,2:38\n8894#2,4:40\n*S KotlinDebug\n*F\n+ 1 LLMStreamFinishMetaData.kt\nai/grazie/model/llm/data/stream/LLMStreamFinishReason$Companion$values$2\n*L\n31#1:38,2\n31#1:40,4\n*E\n"})
/*    */   static final class LLMStreamFinishReason$Companion$values$2 extends Lambda implements Function0<Map<String, ? extends LLMStreamFinishReason>> { public static final LLMStreamFinishReason$Companion$values$2 INSTANCE = new LLMStreamFinishReason$Companion$values$2(); public final Map<String, LLMStreamFinishReason> invoke() { LLMStreamFinishReason[] arrayOfLLMStreamFinishReason1 = LLMStreamFinishReason.values();
/*    */       int $i$f$associateBy = 0;
/* 38 */       int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(arrayOfLLMStreamFinishReason1.length), 16);
/* 39 */       LLMStreamFinishReason[] arrayOfLLMStreamFinishReason2 = arrayOfLLMStreamFinishReason1; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateByTo = 0; byte b; int i;
/* 40 */       for (b = 0, i = arrayOfLLMStreamFinishReason2.length; b < i; ) { Object element$iv$iv = arrayOfLLMStreamFinishReason2[b];
/* 41 */         Object object1 = element$iv$iv; Map<Object, Object> map = destination$iv$iv; int $i$a$-associateBy-LLMStreamFinishReason$Companion$values$2$1 = 0; map.put(object1.getValue(), element$iv$iv); }
/*    */       
/* 43 */       return (Map)destination$iv$iv; }
/*    */ 
/*    */     
/*    */     LLMStreamFinishReason$Companion$values$2() {
/*    */       super(0);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\data\stream\LLMStreamFinishReason.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */