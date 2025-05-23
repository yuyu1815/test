/*     */ package ai.grazie.utils.mpp;
/*     */ 
/*     */ import java.io.InputStream;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.io.ByteStreamsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\022\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\020\020\007\032\004\030\0010\0042\006\020\005\032\0020\006J\020\020\b\032\004\030\0010\t2\006\020\005\032\0020\006J\016\020\n\032\0020\0062\006\020\005\032\0020\006J\020\020\013\032\004\030\0010\0062\006\020\005\032\0020\006¨\006\f"}, d2 = {"Lai/grazie/utils/mpp/Resources;", "", "()V", "bytes", "", "path", "", "bytesOrNull", "streamOrNull", "Ljava/io/InputStream;", "text", "textOrNull", "utils-common"})
/*     */ public final class Resources
/*     */ {
/*     */   @NotNull
/*     */   public static final Resources INSTANCE = new Resources();
/*     */   
/*     */   @Nullable
/*     */   public final InputStream streamOrNull(@NotNull String path) {
/* 142 */     Intrinsics.checkNotNullParameter(path, "path"); return Resources.class.getResourceAsStream(path);
/*     */   }
/*     */   @Nullable
/*     */   public final byte[] bytesOrNull(@NotNull String path) {
/* 146 */     Intrinsics.checkNotNullParameter(path, "path"); Resources.class.getResourceAsStream(path); return (Resources.class.getResourceAsStream(path) != null) ? ByteStreamsKt.readBytes(Resources.class.getResourceAsStream(path)) : null;
/*     */   }
/*     */   @Nullable
/*     */   public final String textOrNull(@NotNull String path) {
/* 150 */     Intrinsics.checkNotNullParameter(path, "path"); byte[] arrayOfByte = bytesOrNull(path); return (arrayOfByte != null) ? new String(arrayOfByte, Charsets.UTF_8) : null;
/*     */   }
/*     */   @NotNull
/*     */   public final byte[] bytes(@NotNull String path) {
/* 154 */     Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNull(Resources.class.getResourceAsStream(path)); return ByteStreamsKt.readBytes(Resources.class.getResourceAsStream(path));
/*     */   }
/*     */   @NotNull
/*     */   public final String text(@NotNull String path) {
/* 158 */     Intrinsics.checkNotNullParameter(path, "path"); return new String(bytes(path), Charsets.UTF_8);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\Resources.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */