/*    */ package ai.grazie.model.cloud.exceptions;
/*    */ import ai.grazie.model.cloud.HeaderCollection;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\003\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b7\030\0002\0020\001:\002\017\020B)\b\004\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\002\020\nR\022\020\013\032\0020\fX¦\004¢\006\006\032\004\b\r\020\016\001\002\021\022¨\006\023"}, d2 = {"Lai/grazie/model/cloud/exceptions/JsonBodyException;", "Lai/grazie/model/cloud/exceptions/HttpExceptionBase;", "description", "", "e", "", "status", "", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;Ljava/lang/Throwable;ILai/grazie/model/cloud/HeaderCollection;)V", "body", "Lai/grazie/model/cloud/exceptions/ExceptionBody;", "getBody", "()Lai/grazie/model/cloud/exceptions/ExceptionBody;", "NotAcceptedAgreement", "Unknown", "Lai/grazie/model/cloud/exceptions/JsonBodyException$NotAcceptedAgreement;", "Lai/grazie/model/cloud/exceptions/JsonBodyException$Unknown;", "model-cloud"})
/*    */ public abstract class JsonBodyException extends HttpExceptionBase {
/*    */   private JsonBodyException(String description, Throwable e, int status, HeaderCollection headers) {
/* 11 */     super(description, e, status, headers);
/*    */   }
/*    */   @NotNull
/*    */   public abstract ExceptionBody getBody();
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\000\n\002\020\003\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\030\0002\0020\001B+\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007\022\b\b\002\020\b\032\0020\t¢\006\002\020\nR\024\020\013\032\0020\fX\004¢\006\b\n\000\032\004\b\r\020\016¨\006\017"}, d2 = {"Lai/grazie/model/cloud/exceptions/JsonBodyException$Unknown;", "Lai/grazie/model/cloud/exceptions/JsonBodyException;", "description", "", "status", "", "e", "", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/lang/String;ILjava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "body", "Lai/grazie/model/cloud/exceptions/ExceptionBody$Unknown;", "getBody", "()Lai/grazie/model/cloud/exceptions/ExceptionBody$Unknown;", "model-cloud"})
/*    */   public static final class Unknown extends JsonBodyException {
/*    */     @NotNull
/*    */     private final ExceptionBody.Unknown body;
/* 19 */     public Unknown(@NotNull String description, int status, @Nullable Throwable e, @NotNull HeaderCollection headers) { super(description, e, status, headers, null);
/* 20 */       this.body = new ExceptionBody.Unknown(description, status); } @NotNull public ExceptionBody.Unknown getBody() { return this.body; }
/*    */   
/*    */   }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\003\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\030\0002\0020\001B)\022\f\020\002\032\b\022\004\022\0020\0040\003\022\n\b\002\020\005\032\004\030\0010\006\022\b\b\002\020\007\032\0020\b¢\006\002\020\tR\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\f\020\r¨\006\016"}, d2 = {"Lai/grazie/model/cloud/exceptions/JsonBodyException$NotAcceptedAgreement;", "Lai/grazie/model/cloud/exceptions/JsonBodyException;", "agreements", "", "Lai/grazie/model/cloud/exceptions/ExceptionBody$NotAcceptedAgreement$Agreement;", "e", "", "headers", "Lai/grazie/model/cloud/HeaderCollection;", "(Ljava/util/List;Ljava/lang/Throwable;Lai/grazie/model/cloud/HeaderCollection;)V", "body", "Lai/grazie/model/cloud/exceptions/ExceptionBody$NotAcceptedAgreement;", "getBody", "()Lai/grazie/model/cloud/exceptions/ExceptionBody$NotAcceptedAgreement;", "model-cloud"})
/*    */   public static final class NotAcceptedAgreement extends JsonBodyException { @NotNull
/*    */     private final ExceptionBody.NotAcceptedAgreement body;
/*    */     
/* 27 */     public NotAcceptedAgreement(@NotNull List<ExceptionBody.NotAcceptedAgreement.Agreement> agreements, @Nullable Throwable e, @NotNull HeaderCollection headers) { super("Agreements " + CollectionsKt.joinToString$default(agreements, null, null, null, 0, null, null.INSTANCE, 31, null) + " are not accepted", e, 452, headers, null);
/* 28 */       this.body = new ExceptionBody.NotAcceptedAgreement(agreements); } @NotNull public ExceptionBody.NotAcceptedAgreement getBody() { return this.body; }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\exceptions\JsonBodyException.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */