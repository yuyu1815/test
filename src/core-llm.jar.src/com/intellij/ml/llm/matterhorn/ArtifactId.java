/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import com.intellij.openapi.util.io.FileUtil;
/*    */ import com.intellij.util.text.StringKt;
/*    */ import java.util.List;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin._Assertions;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\r\n\002\020\b\n\002\b\002\b\b\030\000  *\004\b\000\020\0012\0020\002:\001 B\035\022\006\020\003\032\0020\004\022\f\020\005\032\b\022\004\022\0028\0000\006¢\006\004\b\007\020\bJ\b\020\017\032\0020\004H\026J\022\020\020\032\0020\0212\n\020\022\032\006\022\002\b\0030\000J \020\023\032\b\022\004\022\002H\0010\000\"\004\b\001\020\0012\f\020\005\032\b\022\004\022\002H\0010\006J(\020\023\032\b\022\004\022\002H\0010\000\"\004\b\001\020\0012\006\020\r\032\0020\0042\f\020\005\032\b\022\004\022\002H\0010\006J\"\020\024\032\n\022\004\022\002H\001\030\0010\000\"\004\b\001\020\0012\f\020\005\032\b\022\004\022\002H\0010\006J \020\025\032\b\022\004\022\002H\0010\000\"\004\b\001\020\0012\f\020\005\032\b\022\004\022\002H\0010\006J\024\020\026\032\b\022\004\022\0028\0000\0002\006\020\r\032\0020\004J\006\020\027\032\0020\004J\006\020\030\032\0020\004J\t\020\031\032\0020\004HÆ\003J\017\020\032\032\b\022\004\022\0028\0000\006HÆ\003J)\020\033\032\b\022\004\022\0028\0000\0002\b\b\002\020\003\032\0020\0042\016\b\002\020\005\032\b\022\004\022\0028\0000\006HÆ\001J\023\020\034\032\0020\0212\b\020\035\032\004\030\0010\002HÖ\003J\t\020\036\032\0020\037HÖ\001R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\t\020\nR\027\020\005\032\b\022\004\022\0028\0000\006¢\006\b\n\000\032\004\b\013\020\fR\021\020\r\032\0020\0048F¢\006\006\032\004\b\016\020\n¨\006!"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "O", "", "path", "", "type", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactType;)V", "getPath", "()Ljava/lang/String;", "getType", "()Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "name", "getName", "toString", "isAncestorOf", "", "id", "childOfType", "parentOfType", "changeType", "changeName", "toFileName", "toChildDirectory", "component1", "component2", "copy", "equals", "other", "hashCode", "", "Companion", "core"})
/*    */ public final class ArtifactId<O>
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String path;
/*    */   @NotNull
/*    */   private final ArtifactType<O> type;
/*    */   @NotNull
/*    */   public static final String ARTIFACT_SPLITTER = "///";
/*    */   
/*    */   public ArtifactId(@NotNull String path, @NotNull ArtifactType<O> type) {
/* 29 */     this.path = path; this.type = type;
/*    */     
/* 31 */     boolean bool = !StringsKt.contains$default(this.path, "\n", false, 2, null) ? true : false; if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/* 32 */      bool = !StringsKt.contains$default(this.path, "\r", false, 2, null) ? true : false; if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/*    */      } @NotNull public final String getPath() { return this.path; }
/*    */   @NotNull public final ArtifactType<O> getType() { return this.type; }
/* 35 */   @NotNull public final String getName() { String[] arrayOfString = new String[1]; arrayOfString[0] = "///"; return (String)CollectionsKt.last(StringsKt.split$default(this.path, arrayOfString, false, 0, 6, null)); }
/*    */    @NotNull
/*    */   public String toString() {
/* 38 */     return this.path + "." + this.path;
/*    */   }
/*    */   
/* 41 */   public final boolean isAncestorOf(@NotNull ArtifactId id) { Intrinsics.checkNotNullParameter(id, "id"); return (StringsKt.startsWith$default(id.path, "///", this.path.length(), false, 4, null) && StringsKt.startsWith$default(id.path, this.path, false, 2, null)); } @NotNull
/*    */   public final <O> ArtifactId<O> childOfType(@NotNull ArtifactType<O> type) {
/* 43 */     Intrinsics.checkNotNullParameter(type, "type"); return childOfType(type.getName(), type);
/*    */   } @NotNull
/*    */   public final <O> ArtifactId<O> childOfType(@NotNull String name, @NotNull ArtifactType<O> type) {
/* 46 */     Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullParameter(type, "type"); return new ArtifactId(this.path + "///" + this.path, type);
/*    */   }
/*    */   @Nullable
/*    */   public final <O> ArtifactId<O> parentOfType(@NotNull ArtifactType<O> type) {
/* 50 */     Intrinsics.checkNotNullParameter(type, "type"); String[] arrayOfString = new String[1]; arrayOfString[0] = "///"; List parts = CollectionsKt.dropLast(StringsKt.split$default(this.path, arrayOfString, false, 0, 6, null), 1);
/* 51 */     return parts.isEmpty() ? null : new ArtifactId(CollectionsKt.joinToString$default(parts, "///", null, null, 0, null, null, 62, null), type);
/*    */   }
/*    */   @NotNull
/*    */   public final <O> ArtifactId<O> changeType(@NotNull ArtifactType<O> type) {
/* 55 */     Intrinsics.checkNotNullParameter(type, "type"); return new ArtifactId(this.path, type);
/*    */   } @NotNull
/*    */   public final ArtifactId<O> changeName(@NotNull String name) {
/* 58 */     Intrinsics.checkNotNullParameter(name, "name"); String[] arrayOfString = new String[1]; arrayOfString[0] = "///"; return new ArtifactId(CollectionsKt.joinToString$default(CollectionsKt.plus(CollectionsKt.dropLast(StringsKt.split$default(this.path, arrayOfString, false, 0, 6, null), 1), name), "///", null, null, 0, null, null, 62, null), this.type);
/*    */   }
/*    */   @NotNull
/* 61 */   public final String toFileName() { String sanitizedPath = toChildDirectory();
/* 62 */     return sanitizedPath + "." + sanitizedPath; }
/*    */   @NotNull public final String component1() { return this.path; }
/*    */   @NotNull public final ArtifactType<O> component2() { return this.type; }
/*    */   @NotNull public final ArtifactId<O> copy(@NotNull String path, @NotNull ArtifactType<O> type) { Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNullParameter(type, "type");
/* 66 */     return new ArtifactId(path, type); } @NotNull public final String toChildDirectory() { String[] arrayOfString = new String[1]; arrayOfString[0] = "///"; String sanitizedPath = CollectionsKt.joinToString$default(StringsKt.split$default(this.path, arrayOfString, false, 0, 6, null), "/", null, null, 0, null, ArtifactId::toChildDirectory$lambda$0, 30, null);
/*    */ 
/*    */ 
/*    */     
/* 70 */     return sanitizedPath; }
/*    */   public int hashCode() { result = this.path.hashCode(); return result * 31 + this.type.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other)
/*    */       return true;  if (!(other instanceof ArtifactId))
/*    */       return false;  ArtifactId artifactId = (ArtifactId)other;
/*    */     return !Intrinsics.areEqual(this.path, artifactId.path) ? false : (!!Intrinsics.areEqual(this.type, artifactId.type)); } private static final CharSequence toChildDirectory$lambda$0(String it) { Intrinsics.checkNotNullParameter(it, "it");
/*    */     return Companion.sanitizeArtifactName(it); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\006\032\0020\0052\006\020\007\032\0020\005R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactId$Companion;", "", "<init>", "()V", "ARTIFACT_SPLITTER", "", "sanitizeArtifactName", "name", "core"}) public static final class Companion
/*    */   {
/* 77 */     @NotNull public final String sanitizeArtifactName(@NotNull String name) { Intrinsics.checkNotNullParameter(name, "name"); Intrinsics.checkNotNullExpressionValue(StringKt.trimMiddle$default(name, 50, false, 2, null).toLowerCase(Locale.ROOT), "toLowerCase(...)"); Intrinsics.checkNotNullExpressionValue(FileUtil.sanitizeFileName(StringKt.trimMiddle$default(name, 50, false, 2, null).toLowerCase(Locale.ROOT), false), "sanitizeFileName(...)"); return FileUtil.sanitizeFileName(StringKt.trimMiddle$default(name, 50, false, 2, null).toLowerCase(Locale.ROOT), false); }
/*    */ 
/*    */     
/*    */     private Companion() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ArtifactId.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */