/*    */ package com.intellij.ml.llm.matterhorn.activation.data.model;
/*    */ 
/*    */ import com.intellij.ml.llm.activation.data.model.GrazieAgentKt;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.TuplesKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\035\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t¢\006\004\b\n\020\013¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData$Companion;", "", "<init>", "()V", "forGrazieJwtAuth", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "origin", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthOrigin;", "authJwt", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthJwt;", "forGrazieJwtAuth-B-TJSaM", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthOrigin;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "data.model"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final GrazieAuthData forGrazieJwtAuth-B-TJSaM(@NotNull GrazieAuthOrigin origin, @NotNull String authJwt) {
/* 15 */     Intrinsics.checkNotNullParameter(origin, "origin"); Intrinsics.checkNotNullParameter(authJwt, "authJwt");
/*    */ 
/*    */     
/* 18 */     Pair[] arrayOfPair = new Pair[2]; arrayOfPair[0] = TuplesKt.to("Grazie-Authenticate-JWT", authJwt); arrayOfPair[1] = 
/* 19 */       GrazieAgentKt.getGrazieAgentHeader();
/*    */     return new GrazieAuthData(origin, SimpleHttpHeaders.Companion.of-vDDv_S8((Pair<String, String>[])arrayOfPair), null);
/*    */   }
/*    */   
/*    */   private Companion() {}
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\model\GrazieAuthData$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */