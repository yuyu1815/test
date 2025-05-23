/*    */ package ai.grazie.utils.jwt;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import ai.grazie.utils.mpp.Base64;
/*    */ import ai.grazie.utils.mpp.Base64Kt;
/*    */ import ai.grazie.utils.mpp.UUID;
/*    */ import ai.grazie.utils.mpp.time.ExtensionsKt;
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import kotlinx.serialization.json.JsonElement;
/*    */ import kotlinx.serialization.json.JsonElementKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\006\020\b\032\0020\tJ\020\020\n\032\004\030\0010\0032\006\020\013\032\0020\003J\020\020\f\032\004\030\0010\t2\006\020\013\032\0020\003J\020\020\r\032\004\030\0010\0162\006\020\013\032\0020\003R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\007\032\0020\003X\004¢\006\002\n\000¨\006\017"}, d2 = {"Lai/grazie/utils/jwt/JWTToken;", "", "token", "", "(Ljava/lang/String;)V", "parsed", "Lkotlinx/serialization/json/JsonElement;", "payload", "getExpiration", "Lai/grazie/utils/mpp/time/Timestamp;", "getText", "name", "getTimestamp", "getUUID", "Lai/grazie/utils/mpp/UUID;", "utils-jwt"})
/*    */ @SourceDebugExtension({"SMAP\nJWTToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JWTToken.kt\nai/grazie/utils/jwt/JWTToken\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/*    */ public final class JWTToken {
/*    */   @NotNull
/*    */   private final String payload;
/*    */   
/*    */   public JWTToken(@NotNull String token) {
/* 23 */     String[] arrayOfString = new String[1]; arrayOfString[0] = "."; String payload = StringsKt.split$default(token, arrayOfString, false, 0, 6, null).get(1);
/* 24 */     this.payload = Base64Kt.decodeToUTF(Base64.INSTANCE, payload);
/* 25 */     this.parsed = JSON.Default.INSTANCE.getJson().parseToJsonElement(this.payload);
/*    */   } @NotNull
/*    */   private final JsonElement parsed;
/*    */   @Nullable
/*    */   public final UUID getUUID(@NotNull String name) {
/* 30 */     Intrinsics.checkNotNullParameter(name, "name"); String it = JsonElementKt.getContentOrNull(JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name)));
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
/* 46 */     int $i$a$-let-JWTToken$getUUID$1 = 0;
/*    */     JsonElementKt.getContentOrNull(JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name)));
/*    */     return ((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name) != null && JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name)) != null && JsonElementKt.getContentOrNull(JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name))) != null) ? UUID.Companion.ofText(it) : null;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getText(@NotNull String name) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name));
/*    */     return ((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name) != null && JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name)) != null) ? JsonElementKt.getContentOrNull(JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name))) : null;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp getExpiration() {
/*    */     Intrinsics.checkNotNull(JsonElementKt.getJsonObject(this.parsed).get("exp"));
/*    */     return ExtensionsKt.toTimestamp(JsonElementKt.getLong(JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.parsed).get("exp"))) * 1000L);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Timestamp getTimestamp(@NotNull String name) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     JsonElementKt.getLongOrNull(JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name)));
/*    */     return ((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name) != null && JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name)) != null && JsonElementKt.getLongOrNull(JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name))) != null) ? ExtensionsKt.toTimestamp(JsonElementKt.getLongOrNull(JsonElementKt.getJsonPrimitive((JsonElement)JsonElementKt.getJsonObject(this.parsed).get(name))).longValue()) : null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-jwt-jvm-0.4.32.jar!\ai\grazi\\utils\jwt\JWTToken.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */