/*    */ package ai.grazie.utils;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.nio.file.Files;
/*    */ import java.nio.file.LinkOption;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ import java.util.Arrays;
/*    */ import java.util.Iterator;
/*    */ import java.util.zip.ZipEntry;
/*    */ import java.util.zip.ZipFile;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\006¨\006\b"}, d2 = {"Lai/grazie/utils/Zip;", "", "()V", "unzip", "", "zipPath", "Ljava/nio/file/Path;", "outputDirectory", "utils-common"})
/*    */ public final class Zip {
/*    */   private static final boolean unzip$isUnsafeZipEntryName(String name) {
/* 18 */     Intrinsics.checkNotNullExpressionValue(System.getProperty("os.name"), "getProperty(\"os.name\")"); return (StringsKt.isBlank(name) || StringsKt.startsWith$default(name, "/", false, 2, null) || StringsKt.startsWith$default(name, "\\", false, 2, null) || StringsKt.contains$default(name, "..", false, 2, null) || (StringsKt.contains$default(name, ":", false, 2, null) && StringsKt.contains$default(System.getProperty("os.name"), "windows", false, 2, null)));
/*    */   } @NotNull
/*    */   public static final Zip INSTANCE = new Zip(); public final void unzip(@NotNull Path zipPath, @NotNull Path outputDirectory) {
/* 21 */     Intrinsics.checkNotNullParameter(zipPath, "zipPath"); Intrinsics.checkNotNullParameter(outputDirectory, "outputDirectory"); ZipFile zipFile = new ZipFile(zipPath.toFile()); Throwable throwable = null; try { ZipFile zip = zipFile; int $i$a$-use-Zip$unzip$1 = 0;
/* 22 */       Intrinsics.checkNotNullExpressionValue(zip.entries(), "zip.entries()"); for (Iterator<ZipEntry> iterator = CollectionsKt.iterator(zip.entries()); iterator.hasNext(); ) { Throwable throwable1; ZipEntry entry = iterator.next();
/* 23 */         Intrinsics.checkNotNullExpressionValue(entry.getName(), "entry.name"); if (!(!unzip$isUnsafeZipEntryName(entry.getName()) ? 1 : 0)) { int $i$a$-require-Zip$unzip$1$1 = 0; String str = "'" + 
/* 24 */             entry.getName() + "' is not a safe zip entry name."; throw new IllegalArgumentException(str.toString()); }
/*    */         
/* 26 */         Path entryPath = outputDirectory.resolve(entry.getName());
/* 27 */         if (entry.isDirectory()) { Intrinsics.checkNotNullExpressionValue(entryPath, "entryPath"); if (!Files.exists(entryPath, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length))) {
/* 28 */             Intrinsics.checkNotNullExpressionValue(Files.createDirectories(entryPath, (FileAttribute<?>[])Arrays.copyOf(new FileAttribute[0], (new FileAttribute[0]).length)), "createDirectories(...)"); Files.createDirectories(entryPath, (FileAttribute<?>[])Arrays.copyOf(new FileAttribute[0], (new FileAttribute[0]).length)); continue;
/*    */           }  }
/* 30 */          Intrinsics.checkNotNullExpressionValue(entryPath.getParent(), "entryPath.parent"); Path path1 = entryPath.getParent(); LinkOption[] arrayOfLinkOption = new LinkOption[0]; if (!Files.exists(path1, Arrays.<LinkOption>copyOf(arrayOfLinkOption, arrayOfLinkOption.length))) {
/* 31 */           Intrinsics.checkNotNullExpressionValue(entryPath.getParent(), "entryPath.parent"); path1 = entryPath.getParent(); FileAttribute[] arrayOfFileAttribute = new FileAttribute[0]; Intrinsics.checkNotNullExpressionValue(Files.createDirectories(path1, (FileAttribute<?>[])Arrays.copyOf(arrayOfFileAttribute, arrayOfFileAttribute.length)), "createDirectories(...)"); Files.createDirectories(path1, (FileAttribute<?>[])Arrays.copyOf(arrayOfFileAttribute, arrayOfFileAttribute.length));
/*    */         } 
/* 33 */         InputStream inputStream = zip.getInputStream(entry); arrayOfLinkOption = null; try { InputStream input = inputStream; int $i$a$-use-Zip$unzip$1$2 = 0;
/* 34 */           Intrinsics.checkNotNullExpressionValue(entryPath, "entryPath"); Intrinsics.checkNotNullExpressionValue(Files.newOutputStream(entryPath, Arrays.copyOf(new java.nio.file.OpenOption[0], (new java.nio.file.OpenOption[0]).length)), "newOutputStream(...)"); OutputStream outputStream = Files.newOutputStream(entryPath, Arrays.copyOf(new java.nio.file.OpenOption[0], (new java.nio.file.OpenOption[0]).length)); Throwable throwable2 = null; try { OutputStream output = outputStream; int $i$a$-use-Zip$unzip$1$2$1 = 0;
/* 35 */             Intrinsics.checkNotNullExpressionValue(input, "input"); long l1 = ByteStreamsKt.copyTo$default(input, output, 0, 2, null); } catch (Throwable throwable3) { throwable2 = throwable3 = null; throw throwable3; } finally { CloseableKt.closeFinally(outputStream, throwable2); }
/*    */            long l = l1; }
/*    */         catch (Throwable throwable2) { throwable1 = throwable2 = null; throw throwable2; }
/*    */         finally { CloseableKt.closeFinally(inputStream, throwable1); }
/*    */          }
/* 40 */        Unit unit = Unit.INSTANCE; }
/*    */     catch (Throwable throwable1)
/*    */     { throwable = throwable1 = null;
/*    */       throw throwable1; }
/*    */     finally
/*    */     { CloseableKt.closeFinally(zipFile, throwable); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\Zip.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */