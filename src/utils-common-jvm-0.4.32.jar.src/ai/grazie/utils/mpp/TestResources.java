/*     */ package ai.grazie.utils.mpp;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.InputStream;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.io.FilesKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Charsets;
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
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\022\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\020\020\007\032\004\030\0010\0042\006\020\005\032\0020\006J\022\020\b\032\004\030\0010\t2\006\020\005\032\0020\006H\002J\016\020\005\032\0020\n2\006\020\005\032\0020\nJ\020\020\013\032\004\030\0010\f2\006\020\005\032\0020\006J\016\020\r\032\0020\0062\006\020\005\032\0020\006J\020\020\016\032\004\030\0010\0062\006\020\005\032\0020\006¨\006\017"}, d2 = {"Lai/grazie/utils/mpp/TestResources;", "", "()V", "bytes", "", "path", "", "bytesOrNull", "file", "Ljava/io/File;", "Lai/grazie/utils/mpp/DataLoader$Path;", "streamOrNull", "Ljava/io/InputStream;", "text", "textOrNull", "utils-common"})
/*     */ @SourceDebugExtension({"SMAP\nLoaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Loaders.kt\nai/grazie/utils/mpp/TestResources\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/*     */ public final class TestResources
/*     */ {
/*     */   @NotNull
/*     */   public static final TestResources INSTANCE = new TestResources();
/*     */   
/*     */   @NotNull
/*     */   public final DataLoader.Path path(@NotNull DataLoader.Path path) {
/* 110 */     Intrinsics.checkNotNullParameter(path, "path"); DataLoader.Path multiplatformPath = new DataLoader.Path("build/processedResources/jvm/test", path);
/* 111 */     if ((new File(multiplatformPath.toRelativePath())).exists()) return new DataLoader.Path(multiplatformPath.toRelativePath()); 
/* 112 */     return new DataLoader.Path("build/resources/test", path);
/*     */   }
/*     */   
/*     */   private final File file(String path) {
/* 116 */     File file1 = new File(path(new DataLoader.Path(path)).toRelativePath()), it = file1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 162 */     int $i$a$-takeIf-TestResources$file$1 = 0;
/*     */     return it.exists() ? file1 : null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final InputStream streamOrNull(@NotNull String path) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     File file = file(path);
/*     */     return (file != null) ? new FileInputStream(file) : null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final byte[] bytesOrNull(@NotNull String path) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     file(path);
/*     */     return (file(path) != null) ? FilesKt.readBytes(file(path)) : null;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String textOrNull(@NotNull String path) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     byte[] arrayOfByte = bytesOrNull(path);
/*     */     return (arrayOfByte != null) ? new String(arrayOfByte, Charsets.UTF_8) : null;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final byte[] bytes(@NotNull String path) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     Intrinsics.checkNotNull(file(path));
/*     */     return FilesKt.readBytes(file(path));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String text(@NotNull String path) {
/*     */     Intrinsics.checkNotNullParameter(path, "path");
/*     */     return new String(bytes(path), Charsets.UTF_8);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\TestResources.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */