/*    */ package ai.grazie.model.cloud.exceptions;
/*    */ 
/*    */ import ai.grazie.model.cloud.HeaderCollection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\003\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\030\0002\0020\001B)\022\f\020\002\032\b\022\004\022\0020\0040\003\022\n\b\002\020\005\032\004\030\0010\006\022\b\b\002\020\007\032\0020\b¢\006\002\020\tR\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\f\020\r¨\006\016"}, d2 = {"Lai/grazie/model/cloud/exceptions/JsonBodyException$NotAcceptedAgreement;", "Lai/grazie/model/cloud/exceptions/JsonBodyException;", "agreements", "", "Lai/grazie/model/cloud/exceptions/ExceptionBody$NotAcceptedAgreement$Agreement;", "e", "", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/util/List;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "body", "Lai/grazie/model/cloud/exceptions/ExceptionBody$NotAcceptedAgreement;", "getBody", "()Lai/grazie/model/cloud/exceptions/ExceptionBody$NotAcceptedAgreement;", "model-cloud"})
/*    */ public final class NotAcceptedAgreement
/*    */   extends JsonBodyException
/*    */ {
/*    */   @NotNull
/*    */   private final ExceptionBody.NotAcceptedAgreement body;
/*    */   
/*    */   public NotAcceptedAgreement(@NotNull List<ExceptionBody.NotAcceptedAgreement.Agreement> agreements, @Nullable Throwable e, @NotNull HeaderCollection headers) {
/* 27 */     super("Agreements " + CollectionsKt.joinToString$default(agreements, null, null, null, 0, null, null.INSTANCE, 31, null) + " are not accepted", e, 452, headers, null);
/* 28 */     this.body = new ExceptionBody.NotAcceptedAgreement(agreements); } @NotNull public ExceptionBody.NotAcceptedAgreement getBody() { return this.body; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\exceptions\JsonBodyException$NotAcceptedAgreement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */