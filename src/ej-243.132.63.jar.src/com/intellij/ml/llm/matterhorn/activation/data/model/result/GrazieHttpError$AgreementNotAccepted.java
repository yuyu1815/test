/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model.result;
/*    */ 
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\006\030\0002\0020\001:\001\rB'\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007¢\006\004\b\t\020\nR\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\013\020\f¨\006\016"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError$AgreementNotAccepted;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;", "message", "", "headers", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/SimpleHttpHeaders;", "requiredAgreements", "", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError$AgreementNotAccepted$Agreement;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getRequiredAgreements", "()Ljava/util/List;", "Agreement", "data.model"})
/*    */ public final class AgreementNotAccepted
/*    */   extends GrazieHttpError
/*    */ {
/*    */   @NotNull
/*    */   private final List<Agreement> requiredAgreements;
/*    */   
/*    */   @NotNull
/*    */   public final List<Agreement> getRequiredAgreements() {
/* 36 */     return this.requiredAgreements;
/* 37 */   } private AgreementNotAccepted(String message, Map headers, List<Agreement> requiredAgreements) { super(GrazieHttpErrorType.ErrorAgreementNotAccepted, message, headers, (DefaultConstructorMarker)null);
/*    */     this.requiredAgreements = requiredAgreements; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\r\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\003HÆ\003J\t\020\016\032\0020\003HÆ\003J'\020\017\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\003HÆ\001J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\001HÖ\003J\t\020\023\032\0020\024HÖ\001J\t\020\025\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\n\020\tR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\013\020\t¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError$AgreementNotAccepted$Agreement;", "", "filename", "", "version", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFilename", "()Ljava/lang/String;", "getVersion", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "data.model"}) public static final class Agreement { @NotNull
/* 39 */     private final String filename; public Agreement(@NotNull String filename, @NotNull String version, @NotNull String url) { this.filename = filename; this.version = version; this.url = url; } @NotNull private final String version; @NotNull private final String url; @NotNull public final String getFilename() { return this.filename; } @NotNull public final String getVersion() { return this.version; } @NotNull public final String getUrl() { return this.url; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final String component1() {
/*    */       return this.filename;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component2() {
/*    */       return this.version;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String component3() {
/*    */       return this.url;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Agreement copy(@NotNull String filename, @NotNull String version, @NotNull String url) {
/*    */       Intrinsics.checkNotNullParameter(filename, "filename");
/*    */       Intrinsics.checkNotNullParameter(version, "version");
/*    */       Intrinsics.checkNotNullParameter(url, "url");
/*    */       return new Agreement(filename, version, url);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Agreement(filename=" + this.filename + ", version=" + this.version + ", url=" + this.url + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       result = this.filename.hashCode();
/*    */       result = result * 31 + this.version.hashCode();
/*    */       return result * 31 + this.url.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Agreement))
/*    */         return false; 
/*    */       Agreement agreement = (Agreement)other;
/*    */       return !Intrinsics.areEqual(this.filename, agreement.filename) ? false : (!Intrinsics.areEqual(this.version, agreement.version) ? false : (!!Intrinsics.areEqual(this.url, agreement.url)));
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\result\GrazieHttpError$AgreementNotAccepted.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */