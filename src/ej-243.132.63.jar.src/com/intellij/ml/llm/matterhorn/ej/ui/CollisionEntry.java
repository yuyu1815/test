/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.components.FileListEntry;
/*     */ import java.io.File;
/*     */ import java.nio.file.Path;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\020\b\n\002\b\004\n\002\020 \n\002\020\016\n\002\b\007\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\006\020\024\032\0020\017J\006\020\025\032\0020\tR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\036\020\n\032\0020\t2\006\020\b\032\0020\t@BX\016¢\006\b\n\000\032\004\b\013\020\fR!\020\r\032\b\022\004\022\0020\0170\0168FX\002¢\006\f\n\004\b\022\020\023\032\004\b\020\020\021¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/CollisionEntry;", "", "source", "Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;)V", "getSource", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/components/FileListEntry;", "value", "", "prefixCount", "getPrefixCount", "()I", "reversedParents", "", "", "getReversedParents", "()Ljava/util/List;", "reversedParents$delegate", "Lkotlin/Lazy;", "buildDisambiguatedName", "incrementPrefix", "ej-ui"})
/*     */ final class CollisionEntry
/*     */ {
/*     */   @NotNull
/*     */   private final FileListEntry source;
/*     */   private int prefixCount;
/*     */   @NotNull
/*     */   private final Lazy reversedParents$delegate;
/*     */   
/*     */   @NotNull
/*     */   public final FileListEntry getSource() {
/*     */     return this.source;
/*     */   }
/*     */   
/*     */   public final int getPrefixCount() {
/*     */     return this.prefixCount;
/*     */   }
/*     */   
/*     */   public CollisionEntry(@NotNull FileListEntry source) {
/*  78 */     this.source = source;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  87 */     this.reversedParents$delegate = LazyKt.lazy(this::reversedParents_delegate$lambda$0); } @NotNull public final List<String> getReversedParents() { Lazy lazy = this.reversedParents$delegate; return (List<String>)lazy.getValue(); } private static final List reversedParents_delegate$lambda$0(CollisionEntry this$0) {
/*  88 */     List segments = new ArrayList();
/*  89 */     Intrinsics.checkNotNullExpressionValue(this$0.source.getFilePath().toAbsolutePath(), "toAbsolutePath(...)"); Path current = this$0.source.getFilePath().toAbsolutePath().getParent();
/*     */     
/*  91 */     while (current != null) {
/*  92 */       current.getFileName(); String fileName = (current.getFileName() != null) ? current.getFileName().toString() : null;
/*  93 */       if (fileName != null && ((((CharSequence)fileName).length() > 0)));
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  98 */     return segments;
/*     */   }
/*     */   @NotNull
/*     */   public final String buildDisambiguatedName() {
/* 102 */     Intrinsics.checkNotNullExpressionValue(File.separator, "separator"); String prefix = CollectionsKt.joinToString$default(CollectionsKt.take(getReversedParents(), this.prefixCount), File.separator, null, null, 0, null, null, 62, null);
/* 103 */     return ((((CharSequence)prefix).length() == 0)) ? 
/* 104 */       this.source.getFileName() : (
/*     */       
/* 106 */       prefix + prefix + File.separator);
/*     */   }
/*     */   
/*     */   public final int incrementPrefix() {
/* 110 */     int i = this.prefixCount; this.prefixCount = i + 1; return i;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\CollisionEntry.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */