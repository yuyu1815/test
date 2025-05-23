/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonArray;
/*     */ import kotlinx.serialization.json.JsonElement;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\005\b\002\030\0002\0020\001B#\022\006\020\002\032\0020\003\022\022\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005¢\006\004\b\b\020\tJ\030\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\022H\024J\030\020\023\032\0020\0072\006\020\024\032\0020\0162\006\020\025\032\0020\006H\026J\b\020\026\032\0020\006H\026R\036\020\n\032\022\022\004\022\0020\0060\013j\b\022\004\022\0020\006`\fX\004¢\006\002\n\000¨\006\027"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeListEncoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeEncoder;", "json", "Lkotlinx/serialization/json/Json;", "nodeConsumer", "Lkotlin/Function1;", "Lkotlinx/serialization/json/JsonElement;", "", "<init>", "(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;)V", "array", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "elementName", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "index", "", "putElement", "key", "element", "getCurrent", "kotlinx-serialization-json"})
/*     */ final class JsonTreeListEncoder
/*     */   extends AbstractJsonTreeEncoder
/*     */ {
/*     */   @NotNull
/*     */   private final ArrayList<JsonElement> array;
/*     */   
/*     */   public JsonTreeListEncoder(@NotNull Json json, @NotNull Function1 nodeConsumer) {
/* 257 */     super(json, nodeConsumer, null);
/* 258 */     this.array = new ArrayList<>(); } @NotNull
/* 259 */   protected String elementName(@NotNull SerialDescriptor descriptor, int index) { Intrinsics.checkNotNullParameter(descriptor, "descriptor"); return String.valueOf(index); }
/*     */   
/*     */   public void putElement(@NotNull String key, @NotNull JsonElement element) {
/* 262 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(element, "element"); int idx = Integer.parseInt(key);
/* 263 */     this.array.add(idx, element);
/*     */   } @NotNull
/*     */   public JsonElement getCurrent() {
/* 266 */     return (JsonElement)new JsonArray(this.array);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonTreeListEncoder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */