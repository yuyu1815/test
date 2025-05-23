/*    */ package ai.grazie.utils.json;
/*    */ 
/*    */ import java.util.concurrent.CancellationException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.json.JsonElement;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\033\020\003\032\0020\0042\006\020\005\032\0020\0062\b\b\002\020\007\032\0020\bH\002J\017\020\t\032\b\022\004\022\0020\0040\nHÆ\001¨\006\013"}, d2 = {"Lai/grazie/utils/json/JSONObject$Companion;", "", "()V", "invoke", "Lai/grazie/utils/json/JSONObject;", "content", "", "json", "Lai/grazie/utils/json/JSON;", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nJSONObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSONObject.kt\nai/grazie/utils/json/JSONObject$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<JSONObject> serializer() {
/* 22 */     return JSONObject.Serializer.INSTANCE; } @NotNull
/*    */   public final JSONObject invoke(@NotNull String content, @NotNull JSON json) {
/* 24 */     Intrinsics.checkNotNullParameter(content, "content"); Intrinsics.checkNotNullParameter(json, "json"); try {
/* 25 */       JsonElement jsonElement = json.parseJsonElement(content);
/*    */       
/* 27 */       if (!(jsonElement instanceof kotlinx.serialization.json.JsonObject)) {
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
/* 75 */         int $i$a$-require-JSONObject$Companion$invoke$1 = 0;
/*    */         String str = "Expected JsonObject but actually it was " + Reflection.getOrCreateKotlinClass(jsonElement.getClass()).getSimpleName();
/*    */         throw new IllegalArgumentException(str.toString());
/*    */       } 
/*    */     } catch (CancellationException e) {
/*    */       throw e;
/*    */     } catch (Throwable e) {
/*    */       throw new IllegalArgumentException("Invalid JSON object received");
/*    */     } 
/*    */     return new JSONObject(content, json, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\json\JSONObject$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */