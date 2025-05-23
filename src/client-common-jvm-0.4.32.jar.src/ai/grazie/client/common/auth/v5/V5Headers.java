/*    */ package ai.grazie.client.common.auth.v5;
/*    */ 
/*    */ import ai.grazie.client.common.model.RequestOptions;
/*    */ import ai.grazie.model.auth.GrazieAgent;
/*    */ import ai.grazie.model.cloud.ip.IPAddress;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.SerializationStrategy;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\004\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J`\020\003\032\0020\0042\006\020\005\032\0020\0062\b\020\007\032\004\030\0010\0062\b\020\b\032\004\030\0010\0062\b\020\t\032\004\030\0010\0062\b\020\n\032\004\030\0010\0132\b\020\f\032\004\030\0010\r2\b\020\016\032\004\030\0010\0062\006\020\017\032\0020\0042\n\b\002\020\020\032\004\030\0010\006H\007J\\\020\003\032\0020\0042\006\020\005\032\0020\0062\b\020\007\032\004\030\0010\0062\b\020\b\032\004\030\0010\0062\b\020\t\032\004\030\0010\0062\b\020\n\032\004\030\0010\0132\b\020\f\032\004\030\0010\r2\b\020\020\032\004\030\0010\0062\b\020\016\032\004\030\0010\0062\006\020\017\032\0020\004¨\006\021"}, d2 = {"Lai/grazie/client/common/auth/v5/V5Headers;", "", "()V", "append", "Lai/grazie/client/common/model/RequestOptions;", "token", "", "userToken", "originalServiceToken", "originalApplicationToken", "agent", "Lai/grazie/model/auth/GrazieAgent;", "userOriginalIP", "Lai/grazie/model/cloud/ip/IPAddress;", "originalUserCountry", "options", "applicationUserId", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nV5Headers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 V5Headers.kt\nai/grazie/client/common/auth/v5/V5Headers\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,75:1\n28#2:76\n28#2:77\n*S KotlinDebug\n*F\n+ 1 V5Headers.kt\nai/grazie/client/common/auth/v5/V5Headers\n*L\n35#1:76\n67#1:77\n*E\n"})
/*    */ public final class V5Headers
/*    */ {
/*    */   @NotNull
/*    */   public static final V5Headers INSTANCE = new V5Headers();
/*    */   
/*    */   @Deprecated(message = "In favor of overload with required applicationUserId")
/*    */   @NotNull
/*    */   public final RequestOptions append(@NotNull String token, @Nullable String userToken, @Nullable String originalServiceToken, @Nullable String originalApplicationToken, @Nullable GrazieAgent agent, @Nullable IPAddress userOriginalIP, @Nullable String originalUserCountry, @NotNull RequestOptions options, @Nullable String applicationUserId) {
/* 32 */     Intrinsics.checkNotNullParameter(token, "token"); Intrinsics.checkNotNullParameter(options, "options"); String[] arrayOfString = new String[1]; arrayOfString[0] = token; options.getHeaders().set("Grazie-Authenticate-JWT", arrayOfString);
/* 33 */     if (userToken != null) { arrayOfString = new String[1]; arrayOfString[0] = userToken; options.getHeaders().set("Grazie-Original-User-JWT", arrayOfString); }
/* 34 */      if (originalServiceToken != null) { arrayOfString = new String[1]; arrayOfString[0] = originalServiceToken; options.getHeaders().set("Grazie-Original-Service-JWT", arrayOfString); }
/* 35 */      if (agent != null) { arrayOfString = new String[1]; JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0; arrayOfString[0] = 
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
/* 76 */         this_$iv.string((SerializationStrategy)GrazieAgent.Companion.serializer(), agent); options.getHeaders().set("Grazie-Agent", arrayOfString); }  if (userOriginalIP != null) { arrayOfString = new String[1]; arrayOfString[0] = userOriginalIP.getDisplay(); options.getHeaders().set("Grazie-Original-User-IP", arrayOfString); }  if (originalApplicationToken != null) { arrayOfString = new String[1]; arrayOfString[0] = originalApplicationToken; options.getHeaders().set("Grazie-Original-Application-JWT", arrayOfString); }  if (applicationUserId != null) { arrayOfString = new String[1]; arrayOfString[0] = applicationUserId; options.getHeaders().set("Grazie-Application-User-ID", arrayOfString); }  if (originalUserCountry != null) { arrayOfString = new String[1]; arrayOfString[0] = originalUserCountry; options.getHeaders().set("Grazie-Original-User-Country", arrayOfString); }  return options; } @NotNull public final RequestOptions append(@NotNull String token, @Nullable String userToken, @Nullable String originalServiceToken, @Nullable String originalApplicationToken, @Nullable GrazieAgent agent, @Nullable IPAddress userOriginalIP, @Nullable String applicationUserId, @Nullable String originalUserCountry, @NotNull RequestOptions options) { Intrinsics.checkNotNullParameter(token, "token"); Intrinsics.checkNotNullParameter(options, "options"); String[] arrayOfString = new String[1]; arrayOfString[0] = token; options.getHeaders().set("Grazie-Authenticate-JWT", arrayOfString); if (userToken != null) { arrayOfString = new String[1]; arrayOfString[0] = userToken; options.getHeaders().set("Grazie-Original-User-JWT", arrayOfString); }  if (originalServiceToken != null) { arrayOfString = new String[1]; arrayOfString[0] = originalServiceToken; options.getHeaders().set("Grazie-Original-Service-JWT", arrayOfString); }
/* 77 */      if (agent != null) { arrayOfString = new String[1]; JSON this_$iv = (JSON)JSON.Default.INSTANCE; int $i$f$string = 0; arrayOfString[0] = this_$iv.string((SerializationStrategy)GrazieAgent.Companion.serializer(), agent);
/*    */       options.getHeaders().set("Grazie-Agent", arrayOfString); }
/*    */     
/*    */     if (userOriginalIP != null) {
/*    */       arrayOfString = new String[1];
/*    */       arrayOfString[0] = userOriginalIP.getDisplay();
/*    */       options.getHeaders().set("Grazie-Original-User-IP", arrayOfString);
/*    */     } 
/*    */     if (originalApplicationToken != null) {
/*    */       arrayOfString = new String[1];
/*    */       arrayOfString[0] = originalApplicationToken;
/*    */       options.getHeaders().set("Grazie-Original-Application-JWT", arrayOfString);
/*    */     } 
/*    */     if (applicationUserId != null) {
/*    */       arrayOfString = new String[1];
/*    */       arrayOfString[0] = applicationUserId;
/*    */       options.getHeaders().set("Grazie-Application-User-ID", arrayOfString);
/*    */     } 
/*    */     if (originalUserCountry != null) {
/*    */       arrayOfString = new String[1];
/*    */       arrayOfString[0] = originalUserCountry;
/*    */       options.getHeaders().set("Grazie-Original-User-Country", arrayOfString);
/*    */     } 
/*    */     return options; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\auth\v5\V5Headers.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */