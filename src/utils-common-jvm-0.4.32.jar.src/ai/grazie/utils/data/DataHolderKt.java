/*     */ package ai.grazie.utils.data;
/*     */ 
/*     */ import ai.grazie.utils.json.JSON;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.MagicApiIntrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.SerializersKt;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonObject;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\002\032\n\020\000\032\0020\001*\0020\002\0322\020\003\032\004\030\001H\004\"\n\b\000\020\004\030\001*\0020\005*\0020\0012\006\020\006\032\0020\0072\b\b\002\020\b\032\0020\tH\b¢\006\002\020\n¨\006\013"}, d2 = {"asDataHolder", "Lai/grazie/utils/data/DataHolder;", "Lkotlinx/serialization/json/JsonObject;", "getValue", "T", "", "key", "", "failIfNotFound", "", "(Lai/grazie/utils/data/DataHolder;Ljava/lang/String;Z)Ljava/lang/Object;", "utils-common"})
/*     */ @SourceDebugExtension({"SMAP\nDataHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataHolder.kt\nai/grazie/utils/data/DataHolderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,123:1\n1#2:124\n66#3:125\n*S KotlinDebug\n*F\n+ 1 DataHolder.kt\nai/grazie/utils/data/DataHolderKt\n*L\n111#1:125\n*E\n"})
/*     */ public final class DataHolderKt
/*     */ {
/*     */   @NotNull
/*     */   public static final DataHolder asDataHolder(@NotNull JsonObject $this$asDataHolder) {
/* 122 */     Intrinsics.checkNotNullParameter($this$asDataHolder, "<this>"); return new DataHolder((Map<String, ? extends JsonElement>)$this$asDataHolder);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\data\DataHolderKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */