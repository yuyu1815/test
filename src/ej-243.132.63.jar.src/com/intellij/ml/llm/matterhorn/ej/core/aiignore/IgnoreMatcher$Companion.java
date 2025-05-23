/*     */ package com.intellij.ml.llm.matterhorn.ej.core.aiignore;
/*     */ 
/*     */ import com.intellij.openapi.application.ReadAction;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.io.BufferedReader;
/*     */ import java.io.InputStreamReader;
/*     */ import java.nio.charset.Charset;
/*     */ import java.nio.file.Files;
/*     */ import java.nio.file.LinkOption;
/*     */ import java.nio.file.OpenOption;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.Arrays;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.io.TextStreamsKt;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlin.text.Charsets;
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007J\034\020\b\032\0020\0052\006\020\t\032\0020\0072\f\020\n\032\b\022\004\022\0020\f0\013J\016\020\r\032\0020\0052\006\020\016\032\0020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/aiignore/IgnoreMatcher$Companion;", "", "<init>", "()V", "fromFile", "Lcom/intellij/ml/llm/matterhorn/ej/core/aiignore/IgnoreMatcher;", "ignoreFile", "Ljava/nio/file/Path;", "fromLines", "root", "rawLines", "Lkotlin/sequences/Sequence;", "", "fromVirtualFile", "vFile", "Lcom/intellij/openapi/vfs/VirtualFile;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nIgnoreMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IgnoreMatcher.kt\ncom/intellij/ml/llm/matterhorn/ej/core/aiignore/IgnoreMatcher$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final IgnoreMatcher fromFile(@NotNull Path ignoreFile) {
/*  44 */     Intrinsics.checkNotNullParameter(ignoreFile, "ignoreFile"); Path path1 = ignoreFile; LinkOption[] arrayOfLinkOption = new LinkOption[1]; arrayOfLinkOption[0] = LinkOption.NOFOLLOW_LINKS; arrayOfLinkOption = arrayOfLinkOption; if (!Files.isRegularFile(path1, Arrays.<LinkOption>copyOf(arrayOfLinkOption, arrayOfLinkOption.length))) { int $i$a$-require-IgnoreMatcher$Companion$fromFile$1 = 0; String str = "Ignore file does not exist: " + 
/*  45 */         ignoreFile; throw new IllegalArgumentException(str.toString()); }
/*     */     
/*  47 */     if (ignoreFile.getParent() == null) ignoreFile.getParent();  Path rootDir = Paths.get(".", new String[0]);
/*  48 */     Intrinsics.checkNotNull(rootDir); Path path2 = ignoreFile; OpenOption[] arrayOfOpenOption = new OpenOption[0]; Charset charset = Charsets.UTF_8; char c = ' '; return fromLines(rootDir, TextStreamsKt.lineSequence(new BufferedReader(new InputStreamReader(Files.newInputStream(path2, Arrays.<OpenOption>copyOf(arrayOfOpenOption, arrayOfOpenOption.length)), charset), c)));
/*     */   }
/*     */   
/*     */   @NotNull
/*  52 */   public final IgnoreMatcher fromLines(@NotNull Path root, @NotNull Sequence rawLines) { Intrinsics.checkNotNullParameter(root, "root"); Intrinsics.checkNotNullParameter(rawLines, "rawLines"); List<Rule> list1 = CollectionsKt.createListBuilder(), $this$fromLines_u24lambda_u241 = list1; int $i$a$-buildList-IgnoreMatcher$Companion$fromLines$rules$1 = 0;
/*  53 */     for (String raw : rawLines) { if (Rule.Companion.parse(raw) != null) { Rule p0 = Rule.Companion.parse(raw);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 190 */         int $i$a$-let-IgnoreMatcher$Companion$fromLines$rules$1$1 = 0; $this$fromLines_u24lambda_u241.add(p0); continue; }  Rule.Companion.parse(raw); }  List rules = CollectionsKt.build(list1); return new IgnoreMatcher(rules, root, null); } @NotNull public final IgnoreMatcher fromVirtualFile(@NotNull VirtualFile vFile) { Intrinsics.checkNotNullParameter(vFile, "vFile"); if (!(!vFile.isDirectory() ? 1 : 0)) { int $i$a$-require-IgnoreMatcher$Companion$fromVirtualFile$1 = 0;
/*     */       String str = "Ignore file must be a file: " + vFile;
/*     */       throw new IllegalArgumentException(str.toString()); }
/*     */     
/*     */     Intrinsics.checkNotNullExpressionValue(Paths.get(vFile.getParent().getPath(), new String[0]), "get(...)");
/*     */     Path rootDir = Paths.get(vFile.getParent().getPath(), new String[0]);
/*     */     String text = (String)ReadAction.compute(vFile::fromVirtualFile$lambda$3);
/*     */     Intrinsics.checkNotNull(text);
/*     */     return fromLines(rootDir, StringsKt.lineSequence(text)); }
/*     */ 
/*     */   
/*     */   private static final String fromVirtualFile$lambda$3(VirtualFile $vFile) {
/*     */     // Byte code:
/*     */     //   0: invokestatic getInstance : ()Lcom/intellij/openapi/fileEditor/FileDocumentManager;
/*     */     //   3: aload_0
/*     */     //   4: invokevirtual getDocument : (Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/openapi/editor/Document;
/*     */     //   7: astore_1
/*     */     //   8: aload_1
/*     */     //   9: ifnull -> 27
/*     */     //   12: aload_1
/*     */     //   13: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   18: astore_2
/*     */     //   19: aload_2
/*     */     //   20: ifnull -> 27
/*     */     //   23: aload_2
/*     */     //   24: goto -> 38
/*     */     //   27: aload_0
/*     */     //   28: invokestatic loadText : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/lang/String;
/*     */     //   31: dup
/*     */     //   32: ldc_w 'loadText(...)'
/*     */     //   35: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   38: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #67	-> 0
/*     */     //   #68	-> 3
/*     */     //   #69	-> 8
/*     */     //   #67	-> 12
/*     */     //   #69	-> 13
/*     */     //   #67	-> 18
/*     */     //   #70	-> 27
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	39	0	$vFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\aiignore\IgnoreMatcher$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */