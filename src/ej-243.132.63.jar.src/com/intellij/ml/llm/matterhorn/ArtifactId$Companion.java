/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import com.intellij.openapi.util.io.FileUtil;
/*    */ import com.intellij.util.text.StringKt;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\006\032\0020\0052\006\020\007\032\0020\005R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactId$Companion;", "", "<init>", "()V", "ARTIFACT_SPLITTER", "", "sanitizeArtifactName", "name", "core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final String sanitizeArtifactName(@NotNull String name) {
/* 77 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullExpressionValue(StringKt.trimMiddle$default(name, 50, false, 2, null).toLowerCase(Locale.ROOT), "toLowerCase(...)"); Intrinsics.checkNotNullExpressionValue(FileUtil.sanitizeFileName(StringKt.trimMiddle$default(name, 50, false, 2, null).toLowerCase(Locale.ROOT), false), "sanitizeFileName(...)"); return FileUtil.sanitizeFileName(StringKt.trimMiddle$default(name, 50, false, 2, null).toLowerCase(Locale.ROOT), false);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactId$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */