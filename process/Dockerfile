
FROM  openjdk:11-jre-slim


WORKDIR /app

COPY --from=builder /app/target/changellenge-sber-process-0.0.1-SNAPSHOT.jar process.jar

# Expose the port your Spring Boot application uses (if it's different from the default port)
EXPOSE 8080

CMD ["java", "-jar", "process.jar"]