/*    */ package kotlinx.serialization.json;
/*    */ 
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.PublishedApi;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @JsonDslMarker
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020%\n\002\020\016\n\002\030\002\n\002\b\004\n\002\030\002\n\000\b\007\030\0002\0020\001B\t\b\001¢\006\004\b\002\020\003J\030\020\b\032\004\030\0010\0072\006\020\t\032\0020\0062\006\020\n\032\0020\007J\b\020\013\032\0020\fH\001R\032\020\004\032\016\022\004\022\0020\006\022\004\022\0020\0070\005X\004¢\006\002\n\000¨\006\r"}, d2 = {"Lkotlinx/serialization/json/JsonObjectBuilder;", "", "<init>", "()V", "content", "", "", "Lkotlinx/serialization/json/JsonElement;", "put", "key", "element", "build", "Lkotlinx/serialization/json/JsonObject;", "kotlinx-serialization-json"})
/*    */ public final class JsonObjectBuilder
/*    */ {
/*    */   @NotNull
/* 63 */   private final Map<String, JsonElement> content = new LinkedHashMap<>();
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public final JsonElement put(@NotNull String key, @NotNull JsonElement element) {
/* 70 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(element, "element"); return this.content.put(key, element); } @PublishedApi
/*    */   @NotNull
/*    */   public final JsonObject build() {
/* 73 */     return new JsonObject(this.content);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonObjectBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */