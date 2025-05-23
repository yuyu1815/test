/*    */ package ai.grazie.utils.data;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.json.JsonElement;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\002\032\032\020\000\032\0020\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\006\0320\020\007\032\0020\001\"\n\b\000\020\b\030\001*\0020\t*\0020\0022\006\020\003\032\0020\0042\b\020\007\032\004\030\001H\bH\b¢\006\002\020\n¨\006\013"}, d2 = {"jsonElement", "", "Lai/grazie/utils/data/DataHolderBuilder;", "key", "", "json", "Lkotlinx/serialization/json/JsonElement;", "value", "T", "", "(Lai/grazie/utils/data/DataHolderBuilder;Ljava/lang/String;Ljava/lang/Object;)V", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nDataHolderBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataHolderBuilder.kt\nai/grazie/utils/data/DataHolderBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,51:1\n1#2:52\n32#3:53\n*S KotlinDebug\n*F\n+ 1 DataHolderBuilder.kt\nai/grazie/utils/data/DataHolderBuilderKt\n*L\n45#1:53\n*E\n"})
/*    */ public final class DataHolderBuilderKt
/*    */ {
/*    */   public static final void jsonElement(@NotNull DataHolderBuilder $this$jsonElement, @NotNull String key, @NotNull JsonElement json) {
/* 49 */     Intrinsics.checkNotNullParameter($this$jsonElement, "<this>"); Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(json, "json"); $this$jsonElement.doPut$utils_common(key, json);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\data\DataHolderBuilderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */