/*    */ package ai.grazie.api.gateway.client.api.user;
/*    */ 
/*    */ import ai.grazie.client.common.logging.AnnotationLogger;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\"\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\b\026\030\0002\0020\0012\0020\002B-\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\n\022\006\020\013\032\0020\f¢\006\002\020\rJ\"\020\022\032\b\022\004\022\0020\0240\0232\f\020\025\032\b\022\004\022\0020\0240\023H@¢\006\002\020\026J\034\020\027\032\0020\0302\f\020\025\032\b\022\004\022\0020\0240\023H@¢\006\002\020\026J\034\020\031\032\b\022\004\022\0020\0240\0232\006\020\032\032\0020\030H@¢\006\002\020\033R\032\020\013\032\0020\fX\016¢\006\016\n\000\032\004\b\016\020\017\"\004\b\020\020\021¨\006\034"}, d2 = {"Lai/grazie/api/gateway/client/api/user/AttributeUserAPIClient;", "Lai/grazie/client/attribute/SuspendableAttributeAPIClient;", "Lai/grazie/client/common/cloud/SuspendableCloudClient;", "serverUrl", "", "authType", "Lai/grazie/model/cloud/AuthType;", "httpClient", "Lai/grazie/client/common/SuspendableHTTPClient;", "json", "Lai/grazie/utils/json/JSON;", "annotationLogger", "Lai/grazie/client/common/logging/AnnotationLogger;", "(Ljava/lang/String;Lai/grazie/model/cloud/AuthType;Lai/grazie/client/common/SuspendableHTTPClient;Lai/grazie/utils/json/JSON;Lai/grazie/client/common/logging/AnnotationLogger;)V", "getAnnotationLogger", "()Lai/grazie/client/common/logging/AnnotationLogger;", "setAnnotationLogger", "(Lai/grazie/client/common/logging/AnnotationLogger;)V", "delete", "", "Lai/grazie/utils/attributes/Attributes$Key;", "keys", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Lai/grazie/utils/attributes/Attributes;", "store", "attrs", "(Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api-gateway-client"})
/*    */ @SourceDebugExtension({"SMAP\nAttributeUserAPIClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeUserAPIClient.kt\nai/grazie/api/gateway/client/api/user/AttributeUserAPIClient\n+ 2 SuspendableCloudClient.kt\nai/grazie/client/common/cloud/SuspendableCloudClient\n+ 3 HTTPResponseExtensions.kt\nai/grazie/client/common/model/HTTPResponseExtensionsKt\n*L\n1#1,33:1\n62#2,6:34\n62#2,6:42\n62#2,6:50\n7#3,2:40\n7#3,2:48\n7#3,2:56\n*S KotlinDebug\n*F\n+ 1 AttributeUserAPIClient.kt\nai/grazie/api/gateway/client/api/user/AttributeUserAPIClient\n*L\n19#1:34,6\n24#1:42,6\n29#1:50,6\n19#1:40,2\n24#1:48,2\n29#1:56,2\n*E\n"})
/*    */ public class AttributeUserAPIClient extends SuspendableCloudClient implements SuspendableAttributeAPIClient {
/*    */   @NotNull
/* 15 */   public AnnotationLogger getAnnotationLogger() { return this.annotationLogger; } @NotNull private AnnotationLogger annotationLogger; public void setAnnotationLogger(@NotNull AnnotationLogger <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.annotationLogger = <set-?>; } public AttributeUserAPIClient(@NotNull String serverUrl, @NotNull AuthType authType, @NotNull SuspendableHTTPClient httpClient, @NotNull JSON json, @NotNull AnnotationLogger annotationLogger) {
/* 16 */     super(serverUrl, authType, httpClient, json, new ai.grazie.model.cloud.AuthVersion[0]);
/*    */     this.annotationLogger = annotationLogger;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object store(@NotNull Attributes attrs, @NotNull Continuation<? super Set<? extends Attributes.Key>> $completion) {
/*    */     return store$suspendImpl(this, attrs, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object get(@NotNull Set<? extends Attributes.Key> keys, @NotNull Continuation<? super Attributes> $completion) {
/*    */     return get$suspendImpl(this, keys, $completion);
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object delete(@NotNull Set<? extends Attributes.Key> keys, @NotNull Continuation<? super Set<? extends Attributes.Key>> $completion) {
/*    */     return delete$suspendImpl(this, keys, $completion);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "AttributeUserAPIClient.kt", l = {39}, i = {}, s = {}, n = {}, m = "delete$suspendImpl", c = "ai.grazie.api.gateway.client.api.user.AttributeUserAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class AttributeUserAPIClient$delete$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     AttributeUserAPIClient$delete$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return AttributeUserAPIClient.delete$suspendImpl(AttributeUserAPIClient.this, null, (Continuation<? super Set<? extends Attributes.Key>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "AttributeUserAPIClient.kt", l = {39}, i = {}, s = {}, n = {}, m = "get$suspendImpl", c = "ai.grazie.api.gateway.client.api.user.AttributeUserAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class AttributeUserAPIClient$get$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     AttributeUserAPIClient$get$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return AttributeUserAPIClient.get$suspendImpl(AttributeUserAPIClient.this, null, (Continuation<? super Attributes>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "AttributeUserAPIClient.kt", l = {39}, i = {}, s = {}, n = {}, m = "store$suspendImpl", c = "ai.grazie.api.gateway.client.api.user.AttributeUserAPIClient")
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class AttributeUserAPIClient$store$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     AttributeUserAPIClient$store$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return AttributeUserAPIClient.store$suspendImpl(AttributeUserAPIClient.this, null, (Continuation<? super Set<? extends Attributes.Key>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\api-gateway-client-jvm-0.4.32.jar!\ai\grazie\api\gateway\client\ap\\user\AttributeUserAPIClient.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */