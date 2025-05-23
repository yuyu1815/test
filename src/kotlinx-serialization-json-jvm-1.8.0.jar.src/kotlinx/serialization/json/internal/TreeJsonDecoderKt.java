/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.json.Json;
/*    */ import kotlinx.serialization.json.JsonArray;
/*    */ import kotlinx.serialization.json.JsonElement;
/*    */ import kotlinx.serialization.json.JsonNull;
/*    */ import kotlinx.serialization.json.JsonObject;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000$\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\030\002\n\002\b\002\0321\020\000\032\002H\001\"\004\b\000\020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\f\020\006\032\b\022\004\022\002H\0010\007H\007¢\006\002\020\b\0325\020\t\032\002H\001\"\004\b\000\020\001*\0020\0032\006\020\n\032\0020\0132\006\020\004\032\0020\f2\f\020\006\032\b\022\004\022\002H\0010\007H\000¢\006\002\020\r¨\006\016"}, d2 = {"readJson", "T", "json", "Lkotlinx/serialization/json/Json;", "element", "Lkotlinx/serialization/json/JsonElement;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/json/Json;Lkotlinx/serialization/json/JsonElement;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "readPolymorphicJson", "discriminator", "", "Lkotlinx/serialization/json/JsonObject;", "(Lkotlinx/serialization/json/Json;Ljava/lang/String;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "kotlinx-serialization-json"})
/*    */ public final class TreeJsonDecoderKt
/*    */ {
/*    */   @JsonFriendModuleApi
/*    */   public static final <T> T readJson(@NotNull Json json, @NotNull JsonElement element, @NotNull DeserializationStrategy<? extends T> deserializer) {
/* 20 */     Intrinsics.checkNotNullParameter(json, "json"); Intrinsics.checkNotNullParameter(element, "element"); Intrinsics.checkNotNullParameter(deserializer, "deserializer"); JsonElement jsonElement = element;
/*    */ 
/*    */     
/* 23 */     if (jsonElement instanceof kotlinx.serialization.json.JsonLiteral || Intrinsics.areEqual(jsonElement, JsonNull.INSTANCE)) {  }
/*    */     else { throw new NoWhenBranchMatchedException(); }
/* 25 */      AbstractJsonTreeDecoder input = (jsonElement instanceof JsonObject) ? new JsonTreeDecoder(json, (JsonObject)element, null, null, 12, null) : ((jsonElement instanceof JsonArray) ? new JsonTreeListDecoder(json, (JsonArray)element) : (AbstractJsonTreeDecoder)"JD-Core does not support Kotlin"); return input.decodeSerializableValue(deserializer);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static final <T> T readPolymorphicJson(@NotNull Json $this$readPolymorphicJson, @NotNull String discriminator, @NotNull JsonObject element, @NotNull DeserializationStrategy<? extends T> deserializer) {
/* 33 */     Intrinsics.checkNotNullParameter($this$readPolymorphicJson, "<this>"); Intrinsics.checkNotNullParameter(discriminator, "discriminator"); Intrinsics.checkNotNullParameter(element, "element"); Intrinsics.checkNotNullParameter(deserializer, "deserializer"); return (new JsonTreeDecoder($this$readPolymorphicJson, element, discriminator, deserializer.getDescriptor())).decodeSerializableValue(deserializer);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\TreeJsonDecoderKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */