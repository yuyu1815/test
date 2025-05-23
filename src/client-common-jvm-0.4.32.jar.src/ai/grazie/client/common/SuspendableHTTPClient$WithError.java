/*    */ package ai.grazie.client.common;
/*    */ 
/*    */ import ai.grazie.annotation.TestOnly;
/*    */ import ai.grazie.model.cloud.HeaderCollection;
/*    */ import ai.grazie.model.cloud.HeaderCollectionKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.TuplesKt;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.collections.MapsKt;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @TestOnly
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\004\b\007\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lai/grazie/client/common/SuspendableHTTPClient$WithError;", "Lai/grazie/client/common/SuspendableHTTPClient$WithHeaders;", "client", "Lai/grazie/client/common/SuspendableHTTPClient;", "code", "", "(Lai/grazie/client/common/SuspendableHTTPClient;I)V", "getCode", "()I", "client-common"})
/*    */ public final class WithError
/*    */   extends SuspendableHTTPClient.WithHeaders
/*    */ {
/*    */   private final int code;
/*    */   
/*    */   public WithError(@NotNull SuspendableHTTPClient client, int code) {
/* 58 */     super(
/* 59 */         client, HeaderCollectionKt.of(HeaderCollection.Companion, MapsKt.mapOf(TuplesKt.to("Grazie-Force-HTTP-Error", CollectionsKt.listOf(String.valueOf(code))))));
/*    */     this.code = code;
/*    */   }
/*    */   
/*    */   public final int getCode() {
/*    */     return this.code;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\SuspendableHTTPClient$WithError.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */