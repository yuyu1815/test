/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*     */ 
/*     */ import com.intellij.diff.comparison.ComparisonManager;
/*     */ import com.intellij.diff.comparison.ComparisonPolicy;
/*     */ import com.intellij.diff.fragments.LineFragment;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.PathSerializer;
/*     */ import com.intellij.openapi.progress.DumbProgressIndicator;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.project.ProjectUtil;
/*     */ import com.intellij.openapi.vcs.changes.Change;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.nio.file.Path;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.IntSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
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
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\t\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 -2\0020\001:\002-.B#\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005¢\006\004\b\007\020\bBI\b\020\022\006\020\t\032\0020\n\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\006\020\013\032\0020\n\022\006\020\f\032\0020\n\022\b\020\r\032\004\030\0010\016¢\006\004\b\007\020\017J\006\020\033\032\0020\034J\t\020\035\032\0020\003HÆ\003J\013\020\036\032\004\030\0010\005HÆ\003J\013\020\037\032\004\030\0010\005HÆ\003J+\020 \032\0020\0002\b\b\002\020\002\032\0020\0032\n\b\002\020\004\032\004\030\0010\0052\n\b\002\020\006\032\004\030\0010\005HÆ\001J\023\020!\032\0020\0342\b\020\"\032\004\030\0010\001HÖ\003J\t\020#\032\0020\nHÖ\001J\t\020$\032\0020\005HÖ\001J%\020%\032\0020&2\006\020'\032\0020\0002\006\020(\032\0020)2\006\020*\032\0020+H\001¢\006\002\b,R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\020\020\021\032\004\b\022\020\023R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\024\020\025R\023\020\006\032\004\030\0010\005¢\006\b\n\000\032\004\b\026\020\025R\036\020\013\032\0020\n2\006\020\027\032\0020\n@BX\016¢\006\b\n\000\032\004\b\030\020\031R\036\020\f\032\0020\n2\006\020\027\032\0020\n@BX\016¢\006\b\n\000\032\004\b\032\020\031¨\006/"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "", "path", "Ljava/nio/file/Path;", "initialContent", "", "newContent", "<init>", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "linesAdded", "linesRemoved", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPath$annotations", "()V", "getPath", "()Ljava/nio/file/Path;", "getInitialContent", "()Ljava/lang/String;", "getNewContent", "value", "getLinesAdded", "()I", "getLinesRemoved", "isDeleted", "", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "Companion", "$serializer", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAbstractEditAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractEditAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n1#2:482\n*E\n"})
/*     */ public final class FileChange
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final Path path;
/*     */   @Nullable
/*     */   private final String initialContent;
/*     */   @Nullable
/*     */   private final String newContent;
/*     */   private int linesAdded;
/*     */   private int linesRemoved;
/*     */   
/*     */   public FileChange(@NotNull Path path, @Nullable String initialContent, @Nullable String newContent) {
/* 384 */     this.path = path;
/*     */     
/* 386 */     this.initialContent = initialContent;
/* 387 */     this.newContent = newContent;
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
/* 409 */     if (!((this.initialContent != null || this.newContent != null) ? 1 : 0)) { int $i$a$-require-FileChange$1 = 0; String str = 
/* 410 */         "Either initialContent or newContent must be provided."; throw new IllegalArgumentException(str.toString()); }
/*     */     
/* 412 */     if (!(!Intrinsics.areEqual(this.initialContent, this.newContent) ? 1 : 0)) {
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
/* 482 */       int $i$a$-require-FileChange$2 = 0;
/*     */       String str = "Initial content and new content are the same: " + this.initialContent;
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     CharSequence charSequence = this.initialContent;
/*     */     if ((charSequence == null || charSequence.length() == 0)) {
/*     */       StringsKt.lines(this.newContent);
/*     */       this.linesAdded = (this.newContent != null && StringsKt.lines(this.newContent) != null) ? StringsKt.lines(this.newContent).size() : 0;
/*     */       this.linesRemoved = 0;
/*     */     } else {
/*     */       charSequence = this.newContent;
/*     */       if ((charSequence == null || charSequence.length() == 0)) {
/*     */         this.linesAdded = 0;
/*     */         this.linesRemoved = StringsKt.lines(this.initialContent).size();
/*     */       } else {
/*     */         Intrinsics.checkNotNullExpressionValue(ComparisonManager.getInstance(), "getInstance(...)");
/*     */         ComparisonManager comparisonManager = ComparisonManager.getInstance();
/*     */         ComparisonPolicy policy = ComparisonPolicy.DEFAULT;
/*     */         DumbProgressIndicator indicator = DumbProgressIndicator.INSTANCE;
/*     */         try {
/*     */           Intrinsics.checkNotNullExpressionValue(comparisonManager.compareLines(this.initialContent, this.newContent, policy, (ProgressIndicator)indicator), "compareLines(...)");
/*     */           List lineFragments = comparisonManager.compareLines(this.initialContent, this.newContent, policy, (ProgressIndicator)indicator);
/*     */           int added = 0;
/*     */           int removed = 0;
/*     */           for (LineFragment fragment : lineFragments) {
/*     */             removed += fragment.getEndLine1() - fragment.getStartLine1();
/*     */             added += fragment.getEndLine2() - fragment.getStartLine2();
/*     */           } 
/*     */           this.linesAdded = added;
/*     */           this.linesRemoved = removed;
/*     */         } catch (Exception e) {
/*     */           e.printStackTrace();
/*     */           this.linesAdded = 0;
/*     */           this.linesRemoved = 0;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Path getPath() {
/*     */     return this.path;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String getInitialContent() {
/*     */     return this.initialContent;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String getNewContent() {
/*     */     return this.newContent;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J*\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\b\020\n\032\004\030\0010\0132\b\020\f\032\004\030\0010\013J\026\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\r\032\0020\016J\f\020\017\032\b\022\004\022\0020\0050\020¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange$Companion;", "", "<init>", "()V", "from", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "initialContent", "", "newContent", "change", "Lcom/intellij/openapi/vcs/changes/Change;", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<FileChange> serializer() {
/*     */       return (KSerializer<FileChange>)FileChange.$serializer.INSTANCE;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final FileChange from(@NotNull Project project, @NotNull VirtualFile file, @Nullable String initialContent, @Nullable String newContent) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(file, "file");
/*     */       Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(project));
/*     */       Intrinsics.checkNotNullExpressionValue(ProjectUtil.guessProjectDir(project).toNioPath(), "toNioPath(...)");
/*     */       Path projectPath = ProjectUtil.guessProjectDir(project).toNioPath();
/*     */       Path path = projectPath.relativize(file.toNioPath());
/*     */       Intrinsics.checkNotNull(path);
/*     */       return new FileChange(path, initialContent, newContent);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final FileChange from(@NotNull Project project, @NotNull Change change) {
/*     */       Intrinsics.checkNotNullParameter(project, "project");
/*     */       Intrinsics.checkNotNullParameter(change, "change");
/*     */       Intrinsics.checkNotNull(change.getVirtualFile());
/*     */       change.getBeforeRevision();
/*     */       change.getAfterRevision();
/*     */       return from(project, change.getVirtualFile(), (change.getBeforeRevision() != null) ? change.getBeforeRevision().getContent() : null, (change.getAfterRevision() != null) ? change.getAfterRevision().getContent() : null);
/*     */     }
/*     */   }
/*     */   
/*     */   public final int getLinesAdded() {
/*     */     return this.linesAdded;
/*     */   }
/*     */   
/*     */   public final int getLinesRemoved() {
/*     */     return this.linesRemoved;
/*     */   }
/*     */   
/*     */   public final boolean isDeleted() {
/*     */     return (this.newContent == null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Path component1() {
/*     */     return this.path;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component2() {
/*     */     return this.initialContent;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component3() {
/*     */     return this.newContent;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final FileChange copy(@NotNull Path path, @Nullable String initialContent, @Nullable String newContent) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     return new FileChange(path, initialContent, newContent);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "FileChange(path=" + this.path + ", initialContent=" + this.initialContent + ", newContent=" + this.newContent + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.path.hashCode();
/*     */     result = result * 31 + ((this.initialContent == null) ? 0 : this.initialContent.hashCode());
/*     */     return result * 31 + ((this.newContent == null) ? 0 : this.newContent.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof FileChange))
/*     */       return false; 
/*     */     FileChange fileChange = (FileChange)other;
/*     */     return !Intrinsics.areEqual(this.path, fileChange.path) ? false : (!Intrinsics.areEqual(this.initialContent, fileChange.initialContent) ? false : (!!Intrinsics.areEqual(this.newContent, fileChange.newContent)));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\FileChange.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */